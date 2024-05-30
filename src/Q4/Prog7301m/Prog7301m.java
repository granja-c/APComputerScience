package Q4.Prog7301m;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class Prog7301m {
    public static int argMax(double[] a) {
        int m = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[m]) m = 1;
        }
        return m;
    }
    public static void readandEnc(String file, int num, List<Double[]> X, List<Double[]> y) {
        try {
            Scanner sc = new Scanner(new File(file));
            sc.nextLine();
            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split(",");
                Double[] row = new Double[line.length-1];
                Double[] label_onehot = new Double[num];
                int lbl = Integer.parseInt(line[0]);
                Arrays.fill(label_onehot, 0.0);
                label_onehot[lbl] = 1.0;
                for (int i = 1; i < line.length; i++) {
                    row[i-1] = Double.parseDouble(line[i]);
                }
                X.add(row);
                y.add(label_onehot);
            }
        } catch (IOException E) {
            System.out.println("Can't find file");
        }
    }
    public static double[][] toArray(List<Double[]> list) {
        double[][] arr = new double[list.size()][list.get(0).length];
        for (int r = 0; r < list.size(); r++) {
            for (int c = 0; c < list.get(0).length; c++) {
                arr[r][c] = list.get(r)[c];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        final int N_CLASSES = 10;
        var Xtr = new ArrayList<Double[]>();
        var ytr = new ArrayList<Double[]>();
        readandEnc("langdat/prog7301m_train.csv", N_CLASSES, Xtr, ytr);

        var Xte = new ArrayList<Double[]>();
        var yte = new ArrayList<Double[]>();
        readandEnc("langdat/prog7301m_test.csv", N_CLASSES, Xtr, ytr);

        double[][] X_train = toArray(Xtr);
        double[][] y_train = toArray(ytr);
        double[][] X_test = toArray(Xte);
        double[][] y_test = toArray(yte);

        final int N_INPUT = X_train[0].length;

        var model = new MultiLayerPerceptron(new int[]{N_INPUT, 100, N_CLASSES}, 0.1, new Activations.Sigmoid());
        model.train(X_train, y_train, 10);
        System.out.println("Final Accuracy: " + model.accuracy(X_test, y_test));

        int ind = (int)(Math.random() * X_test.length);
        double[] X_val = X_test[ind];
        double[] y_val = y_test[ind];
        double[] y_pred = model.predict(X_val);
        int pred = argMax(y_pred);
        int actual = argMax(y_val);
        System.out.println("Predicted" + pred + "\tActual" + actual);

        var img = new BufferedImage(28, 28, BufferedImage.TYPE_INT_RGB);
        for (int r = 0; r < 28; r++) {
            for (int c = 0; c < 28; c++) {
                img.setRGB(c, r, (int)(X_val[r * 28 + c]));
            }
        }
        var frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel(new ImageIcon(img)));
        frame.pack();
        frame.setVisible(true);
    }
}
