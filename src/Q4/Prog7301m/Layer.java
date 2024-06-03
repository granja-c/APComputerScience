package Q4.Prog7301m;

import java.io.Serializable;

public class Layer implements Serializable {
    class Neuron implements Serializable {
        public double[] weights;
        public double bias;
        public double value;
        public double Delta;
        public Neuron(int pls) {
            weights = new double[pls];
            bias = Math.random() - 0.5;
            value = Math.random() - 0.5;
            Delta = Math.random() - 0.5;;
            for (int i = 0; i < weights.length; i++) {
                weights[i] = Math.random();
            }
        }
    }
    public Neuron[] neurons;
    public int Size;

    public Layer(int n, int s) {
        neurons = new Neuron[n];
        Size = n;
        for (int i = 0; i < Size; i++) {
            neurons[i] = new Neuron(s);
        }
    }
}