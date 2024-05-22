package Q4.Prog7300p;
import java.util.Arrays;

public class prog7300p {
    public static void main(String[] args) {
        // AND Neuron
        double[][] X_train = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        double[] y_train = {0, 0, 0, 1};

        System.out.println("AND: ");
        var model = new Perceptron(0.1, 15);
        model.fit(X_train, y_train);

        // Predict
        double[] y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // w + b
        System.out.println("Weights: " + Arrays.toString(model.getWeights())); // slope
        System.out.println("Bias: " + model.getBias()); // y inter

        // NOT
        X_train = new double[][]{
                {0},
                {1}
        };
        y_train = new double[]{1, 0};

        System.out.println("--------------------------------------\nNOT: ");
        var model2 = new Perceptron(0.1, 15);
        model2.fit(X_train, y_train);

        // Predict
        y_pred = model2.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // w + b
        System.out.println("Weights: " + Arrays.toString(model2.getWeights())); // slope
        System.out.println("Bias: " + model2.getBias()); // y inter

        // OR
        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{0, 1, 1, 1};
        System.out.println("--------------------------------------\nOR: ");
        var model3 = new Perceptron(0.1, 15);
        model3.fit(X_train, y_train);

        // Predict
        y_pred = model3.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // w + b
        System.out.println("Weights: " + Arrays.toString(model3.getWeights())); // slope
        System.out.println("Bias: " + model3.getBias()); // y inter
        System.out.println();

        // NAND
        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{1, 1, 1, 0};
        System.out.println("--------------------------------------\nNAND: ");
        var model4 = new Perceptron(0.1, 15);
        model4.fit(X_train, y_train);

        // Predict
        y_pred = model4.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // w + b
        System.out.println("Weights: " + Arrays.toString(model4.getWeights())); // slope
        System.out.println("Bias: " + model4.getBias()); // y inter
        System.out.println();



        // NOR
        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{1, 0, 0, 0};
        System.out.println("--------------------------------------\nNOR: ");
        var model5 = new Perceptron(0.1, 15);
        model5.fit(X_train, y_train);

        // Predict
        y_pred = model5.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // w + b
        System.out.println("Weights: " + Arrays.toString(model5.getWeights())); // slope
        System.out.println("Bias: " + model5.getBias()); // y inter
        System.out.println();

    }
}
