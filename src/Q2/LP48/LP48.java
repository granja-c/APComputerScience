package Q2.LP48;
import java.util.*;

public class LP48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Seed: ");
        int sd = sc.nextInt();
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();
        System.out.print("m: ");
        int m = sc.nextInt();

        Cl48 cl = new Cl48(a, c, m, sd);
        for (int lcv = 0; lcv < 10; lcv++) {
            System.out.println(cl);
        }
    }
}
/*
Seed: 12
a: 1246
c: 200
m: 50
(1246 * 12 + 200)  50 = 2
(1246 * 2 + 200)  50 = 42
(1246 * 42 + 200)  50 = 32
(1246 * 32 + 200)  50 = 22
(1246 * 22 + 200)  50 = 12
(1246 * 12 + 200)  50 = 2
(1246 * 2 + 200)  50 = 42
(1246 * 42 + 200)  50 = 32
(1246 * 32 + 200)  50 = 22
(1246 * 22 + 200)  50 = 12
 */
// what