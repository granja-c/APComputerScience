package Q4.Prog7300p;
import java.util.Arrays;

public class xor {
    public static void main(String[] args) {
        double[][] X_train = {
                {0,0},
                {0,1},
                {1,0},
                {1,1}
        };
        var or = new Perceptron(0.1, 15);
        double[] or_train = {0, 1, 1, 1};
        or.fit(X_train, or_train);

        var nand = new Perceptron(0.1, 15);
        double[] nand_train = {1, 1, 1, 0};
        nand.fit(X_train, nand_train);


        var and = new Perceptron(0.1, 15);
        double[] and_train = {0, 0, 0, 1};
        and.fit(X_train, and_train);

        double[] or_pred = or.predict(X_train);
        System.out.println("Pred OR: " + Arrays.toString(or_pred));
        double[] nand_pred = nand.predict(X_train);
        System.out.println("Pred NAND: " + Arrays.toString(nand_pred));
        double[][] xor_train = new double[4][2];
        for (int i = 0; i < or_pred.length; i++) {
            xor_train[i][0] = or_pred[i];
            xor_train[i][1] = nand_pred[i];
        }
        System.out.println("XOR Prediction: " + Arrays.toString(and.predict(xor_train)));
    }
}
