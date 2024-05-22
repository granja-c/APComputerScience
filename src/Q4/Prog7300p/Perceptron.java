package Q4.Prog7300p;
import java.util.function.Function;

public class Perceptron {
    private double lrate;
    private int epochs;
    private double[] weights;
    private double bias;
    private Function<Double, Double> activ;

    private Double unit_step(Double x) { return x > 0 ? 1.0 : 0.0; }

    public Perceptron(double lr, int ep) {
        lrate = lr;
        epochs = ep;
        bias = 1;
        activ = this::unit_step;
    }
    public double[] getWeights() { return weights; }
    public double getBias() { return bias; }

    public double forward(double[] x) {
        double dotprod = bias;
        for (int i = 0; i < x.length; i++) {
            dotprod += x[i] * weights[i];
        }
        return activ.apply(dotprod);
    }
    public double[] predict(double[][] X_test) {
        double[] preds = new double[X_test.length];
        for (int i = 0; i < X_test.length; i++) {
            preds[i] = forward(X_test[i]);
        }
        return preds;
    }

    public void fit(double[][] X_train, double[] y_train) {
        weights = new double[X_train[0].length];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Math.random() - 0.5;
        }

        int n = X_train.length;

        for (int ep = 0; ep < epochs; ep++) {
            double loss = 0;
            for (int i = 0; i < n; i++) {
                double y_pred = forward(X_train[i]);
                double error = y_train[i] - y_pred;
                loss = Math.pow(error, 2);
                for (int j = 0; j < weights.length; j++)
                    weights[j] += lrate * error * X_train[i][j];
                bias += lrate * error;
            }
            System.out.println("Epoch " + (ep+1) + ": Loss: " + (loss/n));
        }
    }
}