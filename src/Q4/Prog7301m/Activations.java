package Q4.Prog7301m;

public class Activations {
    interface Activation {
        public double activate(double val);
        public double activateDeriv(double val);
    }
    public static class Sigmoid implements Activation {
        public double activate(double val) { return 1 / (1+Math.pow(Math.E, -val)); }
        public double activateDeriv(double val) { return val-Math.pow(val, 2); }
    }
    public static class Tanh implements Activation {
        public double activate(double val) { return Math.tanh(val); }
        public double activateDeriv(double val) { return 1-Math.pow(val, 2); }
    }
    public static class ReLU implements Activation {
        public double activate(double val) { return Math.max(0, val); }
        public double activateDeriv(double val) { return val >= 0 ? 1 : 0;}
    }


}
