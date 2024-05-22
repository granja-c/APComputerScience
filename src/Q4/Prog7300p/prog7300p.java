package Q4.Prog7300p;
import java.util.Arrays;

public static void main(String[] args) {
    // AND Neuron
    double[][] X_train = {
        {0, 0},
        {0, 1},
        {1, 0},
        {1, 1}
    };
    double[] y_train = {0, 0, 0, 1};

    System.out.println("AND Neuron: ");
    var model = new Perceptron(0.1, 15);
    model.fit(X_train, y_train);

    // Predict
    double[] y_pred = model.predict(X_train);
    System.out.println("Predicted: " + Arrays.toString(y_pred));
    System.out.println("Predicted: " + Arrays.toString(y_train));

    // w + b
    System.out.println("Weights: " + Arrays.toString(model.getWeights())); // slope
    System.out.println("Bias: " + Arrays.toString(model.getBias())); // y inter

    // NOT
    double[][] X_train = {
        {0},
        {1}
    };
    double[] y_train = {1, 0};

    System.out.println("AND Neuron: ");
    var model2 = new Perceptron(0.1, 15);
    model2.fit(X_train, y_train);

    // Predict
    double[] y_pred = model2.predict(X_train);
    System.out.println("Predicted: " + Arrays.toString(y_pred));
    System.out.println("Predicted: " + Arrays.toString(y_train));

    // w + b
    System.out.println("Weights: " + Arrays.toString(model2.getWeights())); // slope
    System.out.println("Bias: " + Arrays.toString(model2.getBias())); // y inter

    // OR
    X_train = {
        {0, 0},
        {0, 1},
        {1, 0},
        {1, 1}
    };
    y_train = {0, 1, 1, 1};
    System.out.println("OR Neuron: ");
    var model3 = new Perceptron(0.1, 15);
    model3.fit(X_train, y_train);

    // Predict
    double[] y_pred = model3.predict(X_train);
    System.out.println("Predicted: " + Arrays.toString(y_pred));
    System.out.println("Predicted: " + Arrays.toString(y_train));

    // w + b
    System.out.println("Weights: " + Arrays.toString(model3.getWeights())); // slope
    System.out.println("Bias: " + Arrays.toString(model3.getBias())); // y inter

}