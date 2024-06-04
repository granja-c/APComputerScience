package Q4.Prog7301m;
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Iris {
    public static void readCSV(String file, int lblind, List<Double[]> X, List<String> y) {
        try {
            Scanner sc = new Scanner(new File(file));
            sc.nextLine();

            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split(",");
                Double[] row = new Double[line.length-1];
                for (int i = 0; i < line.length; i++) {
                    if (i==lblind) y.add(line[i]);
                    else row[i] = Double.parseDouble(line[i]);
                }
                X.add(row);
            }

        } catch (IOException e) {
            System.out.println("not found");
        }
    }

    public static List<Double[]> encLabels(List<String> y, List<String> classes) {
        for (String lbl : y) {
            if (!classes.contains(lbl)) classes.add(lbl);
        }
        var y_onehot = new ArrayList<Double[]>();
        for (String lbl : y) {
            Double[] lbl_onehot = new Double[classes.size()];
            Arrays.fill(lbl_onehot, 0.0);
            lbl_onehot[classes.indexOf(lbl)] = 1.0;
            y_onehot.add(lbl_onehot);
        }
        return y_onehot;
    }

    public static void main(String[] args) {
        var X = new ArrayList<Double[]>();
        var y_str = new ArrayList<String>();
        var classes = new ArrayList<String>();
        readCSV("Langdat/iris.csv", 4, X, y_str);
        var y = encLabels(y_str, classes);

        int ntr = (int)(X.size()*0.8);
        var Xtr = X.subList(0, ntr);
        var ytr = y.subList(0, ntr);
        var Xte = X.subList(ntr, X.size());
        var yte = y.subList(ntr, y.size());

        var X_train = Prog7301m.toArray(Xtr);
        var y_train = Prog7301m.toArray(ytr);
        var X_test = Prog7301m.toArray(Xte);
        var y_test = Prog7301m.toArray(yte);

        double max = 0;
        for (Double[] r : X) {
            for (Double c : r) {
                if (c > max) max = c;
            }
        }
        Prog7301m.normalize(X_train, max);
        Prog7301m.normalize(y_train, max);

        final int NUMIN = X_train[0].length;
        final int NUMLBL = classes.size();

        var mod = new MultiLayerPerceptron(new int[]{NUMIN, 128, NUMLBL}, 0.1, new Activations.Tanh());
        mod.train(X_train, y_train, 1000);
        System.out.println("Final Accuracy: " + mod.accuracy(X_test, y_test));

        mod.saveMod("Langdat/iris_model.ser");

        int ind = (int)(Math.random()*X_test.length);
        double[] X_val = X_test[ind];
        double[] y_val = y_test[ind];
        double[] ypred = mod.predict(X_val);
        int pred = Prog7301m.argMax(ypred);
        int actual = Prog7301m.argMax(y_val);
        System.out.println("Predicted: " + classes.get(pred) + "\tActual: " + classes.get(actual));
    }

}
