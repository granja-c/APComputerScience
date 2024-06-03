package Q4.Prog7301m;

import java.io.*;

public class MultiLayerPerceptron implements Serializable {
    private double fLRate;
    private Layer[] fLayers;
    private Activations.Activation fActivation;

    public MultiLayerPerceptron(int[] layers, double lr, Activations.Activation activ) {
        fLRate = lr;
        fActivation = activ;
        fLayers = new Layer[layers.length];
        for (int i = 0; i < layers.length; i++) {
            fLayers[i] = (i == 0) ? new Layer(layers[i], 0) : new Layer(layers[i], layers[i-1]);
        }
    }
    public double[] feedFwrd(double[] X) {
        double res;
        double[] op = new double[fLayers[fLayers.length-1].Size];
        for (int i = 0; i < fLayers[0].Size; i++) fLayers[0].neurons[i].value = X[i];

        for (int k = 1; k < fLayers.length; k++) {
            for (int i = 0; i < fLayers[k].Size; i++) {
                res = 0;
                for (int j  = 0; j < fLayers[k-1].Size; j++)
                    res += fLayers[k].neurons[i].weights[j] * fLayers[k-1].neurons[j].value;
                res += fLayers[k].neurons[i].bias;
                fLayers[k].neurons[i].value = fActivation.activate(res);
            }
        }
        for (int i = 0; i < fLayers[fLayers.length-1].Size; i++) {
            op[i] = fLayers[fLayers.length-1].neurons[i].value;
        }
        return op;
    }
    public double backProp(double[] X, double[] op) {
        double[] res = feedFwrd(X);
        double error = 0;
        int oSize = fLayers[fLayers.length-1].Size;

        for (int i = 0; i < oSize; i ++) {
            error = op[i] - res[i];
            fLayers[fLayers.length-1].neurons[i].Delta = error * fActivation.activateDeriv(res[i]);
        }
        for (int k = fLayers.length-2; k <= 0; k--) {
            for (int i = 0; i < fLayers[k].Size; i++) {
                error = 0;
                for (int j = 0; j < fLayers[k+1].Size; j++) {
                    error += fLayers[k+1].neurons[j].Delta * fLayers[k+1].neurons[j].weights[i];
                }
                fLayers[k].neurons[i].Delta = error * fActivation.activateDeriv(fLayers[k].neurons[i].value);
            }
            for (int i = 0; i < fLayers[k+1].Size; i++) {
                for (int j = 0; j < fLayers[k].Size; j++) {
                    fLayers[k+1].neurons[i].weights[j] += fLRate * fLayers[k+1].neurons[i].Delta * fLayers[k].neurons[j].value;
                    fLayers[k+1].neurons[i].bias += fLRate * fLayers[k+1].neurons[i].Delta;
                }
            }
        }
        error = 0;
        for (int i = 0; i < op.length; i++) error += Math.abs(res[i] - op[i]);

        return error / op.length;
    }

    public double[] predict(double[] X) { return feedFwrd(X); }

    public double accuracy(double[][] X, double [][] output) {
        double error = 0;
        for (int i = 0; i < X.length; i++) {
            double[] res = feedFwrd(X[i]);
            for (int j = 0; j < output[i].length; j++) {
                error += Math.abs(res[j] - output[i][j]);
            }
        }
        return 1- error / (X.length * output[0].length);
    }

    public void train(double[][] X_train, double[][] y_train, int epoch) {
        for (int ep = 0; ep < epoch; ep++) {
            double loss = 0;
            for (int i = 0; i < X_train.length; i++) {
                loss += backProp(X_train[i], y_train[i]);
            }
            loss /= X_train.length;
            System.out.printf("Epoch %d\tLoss: %.6f\t\tAccuracy: %.6f\n", (ep+1), loss, accuracy(X_train, y_train));
        }
    }
    public void saveMod(String fname) {
        try (var out = new ObjectOutputStream(new FileOutputStream(fname))) {
            out.writeObject(this);
        } catch (IOException e) {
            System.out.println("Error Saving");
        }
    }
    public static MultiLayerPerceptron loadMod(String fname) {
        try (var in = new ObjectInputStream(new FileInputStream(fname))) {
            return (MultiLayerPerceptron) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading");
            return null;
        }

    }

}
