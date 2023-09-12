package Q1;

public class prog88a {
    public static void main(String[] args) {
        // Math.random() * (max-min) + min
        int n1 = (int)(Math.random() * (13-1)) + 1;
        int n2 = (int)(Math.random() * (20 - 2)) + 2;

        int sum = n1 + n2;
        int dif = n1 - n2;
        int prod = n1 * n2;
        double avg = sum / 2.0;
        int abs = Math.abs(dif);
        int max = 0;
        int min = 0;
        if (n1 > n2) {
            max = n1;
            min = n2;
        } else {
            max = n2;
            min = n1;
        }
        System.out.println("Number 1 = " + n1);
        System.out.println("Number 2 = " + n2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("Product = " + prod);
        System.out.println("Average = " + avg);
        System.out.println("Absolute value = " + abs);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
/*
Number 1 = 1
Number 2 = 8
Sum = 9
Difference = -7
Product = 8
Average = 4.5
Absolute value = 7
Maximum = 8
Minimum = 1
 */