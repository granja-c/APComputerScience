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
    
}