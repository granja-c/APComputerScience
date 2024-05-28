package Q4.Prog7301m;

public class NeuralNetworkTest {
    public static void main(String[] args) {
        double[][] X_train = {{0,0}, {0, 1}, {1, 0}, {1, 1}};
        double [][] y_train = {{0}, {1}, {1}, {0}};
        var model = new MultiLayerPerceptron(new int[]{2, 3, 1}, 0.1, new Activations.Tanh());

        model.train(X_train, y_train, 1000);
        for (int i = 0; i < X_train.length; i++) {
            double res[] = model.predict(X_train[i]);
            System.out.printf("Input: %s\tOutput: %.6f\n",
                    Arrays.toString(x), result[0]);
        }
        System.out.println("Final accuracy: " + model.accuracy(X_train, y_train));
    }
}
