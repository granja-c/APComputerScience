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
        else System.out.println("No");

        boolean same = true;
        for (int lcv = 0; lcv <array.length;lcv++) {
            if (array[lcv] != array[array.length-1-lcv]) {
                same = false;
            }
        }
        System.out.print("Is the array a palindrome? ");
        if (same) System.out.println("Yes");
        else System.out.println("No");

        double average = 0;
        for (int i : array) {
            average += i;
        }
        average /= array.length;
        int c = 0;
        for (int i : array) {
            if (i > average) c++;
        }
        System.out.println("Greater than the average: " + c);

        int es = 0;
        for (int i:array) {
            if (i % 2 == 0) {
                es++;
            }
        }
        System.out.println("# of even numbers: " + es);

        int[] rev = new int[array.length];
        for (int lcv = 0; lcv < array.length; lcv++){
            rev[lcv] = array[array.length-1-lcv];
        }
        for (int i:rev) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] shiftArr = shiftRight(array);
        for (int i:shiftArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum =  0;
        for (int i:array) {
            int digsum = 0;
            int temp = i;
            while (temp>0) {
                int n = temp % 10;
                temp /= 10;
                digsum += n;
            }
            sum += digsum;
        }
        System.out.println("Sum of all digits: " + sum);
    }

    public static int[] shiftRight(int[] arr) {
        int temp = arr[arr.length-1];
        int[] shifted = new int[arr.length];
        for (int lcv = 1; lcv < arr.length; lcv++){
            shifted[lcv] = arr[lcv-1];
        }
        shifted[0] = temp;
        return shifted;
    }
}
/*
34 51 30 53 80 39 23 90 81 73 90 76 47 73 80 66 38 66 88
34 51 30 53 80 39 23 90 81 73 90 76 47 73 80 66 38 66 88
Middle: 73
Average: 65
Smallest: 23	Largest: 90
34 51 30 53 80 39 90 23 81 73 90 76 47 73 80 66 38 66 88
34 51 30 53 80 39 90 23 81 10 90 76 47 73 80 66 38 66 88
44 61 40 63 90 49 100 33 91 20 100 86 57 83 90 76 48 76 98
The ousted number is: 40
Numbers in the 50s: 57
Multiples of 4: 44 100 20 100 76 48 76
Is there a 60? No
Is the array a palindrome? No
Greater than the average: 10
# of even numbers: 11
98 76 48 76 90 83 57 86 100 20 91 33 100 49 90 63 5 61 44
98 44 61 5 63 90 49 100 33 91 20 100 86 57 83 90 76 48 76
Sum of all digits: 172
 */