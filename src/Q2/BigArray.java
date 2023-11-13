package Q2;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] = (int)(Math.random() * (91 - 20) + 20);
        }
        for (int lcv = 0; lcv < array.length; lcv++) {
            System.out.print(array[lcv] + " ");
        }
        System.out.println();

        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Middle: " + array[array.length/2] + "\n");
        System.out.print("Average: " + (array[0] + array[array.length/2] + array[array.length-1])/3 + "\n");
        int sm = array[0];
        int sind = 0;
        int lr = array[0];
        int lind = 0;
        for (int lcv = 1; lcv < array.length; lcv++) {
            if (array[lcv] < sm) {
                sm = array[lcv];
                sind = lcv;
            } else if (array[lcv] > lr) {
                lr = array[lcv];
                lind = lcv;
            }
        }
        System.out.print("Smallest: " + sm + "\tLargest: " + lr + "\n");
        array[sind] = lr;
        array[lind] = sm;
        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // new rand num
        int randNum = (int)(Math.random() * 10 + 1);
        array[array.length/2] = randNum;
        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] += 10;
        }
        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int myThird = array[2];
        array[2] = 5;
        System.out.println("The ousted number is: " + myThird);

        System.out.print("Numbers in the 50s: ");
        for (int i:array) {
            if (i >= 50 && i <= 59) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Multiples of 4: ");
        for (int i:array) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Is there a 60? ");
        boolean is60 = false;

        for (int i:array) {
            if (i == 60) {
                is60 = true;
            }
        }
        if (is60) System.out.println("Yes");
        else System.out.printf("No");


    }
}
