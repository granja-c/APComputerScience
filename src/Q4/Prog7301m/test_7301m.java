package Q4.Prog7301m;

import Q4.Prog7301m.MultiLayerPerceptron;
import Q4.Prog7301m.Prog7301m;

import java.util.ArrayList;

public class test_7301m {
    public static void main(String[] args) {
        var Xte = new ArrayList<Double[]>();
        var yte = new ArrayList<Double[]>();

        Prog7301m.readandEnc("Langdat/prog7301m_test.csv", 10, Xte, yte);
        // var mod = new MultiLayerPerceptron.loadModel("Langdat/prog7301m_model.ser");
//        if (mod == null) {
//            System.out.println("not found");
//            return;
//        }
//        double[][] X_test = Prog7301m.toArray(Xte);
//        double[][] y_test = Prog7301m.toArray(yte);
//        double acc = mod.accuracy(X_test, y_test);
//        System.out.println("Accuracy: " + acc);
    }
}
