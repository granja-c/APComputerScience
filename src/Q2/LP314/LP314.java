package Q2.LP314;
import java.util.*;

public class LP314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cl314 e = new Cl314();
        System.out.print("Election Results for New York:\nAwbrey: ");
        int av = sc.nextInt();
        System.out.print("Martiez: ");
        int mv = sc.nextInt();
        e.newState(av, mv);
        System.out.print("Election Results for New Jersey:\nAwbrey: ");
        av = sc.nextInt();
        System.out.print("Martiez: ");
        mv = sc.nextInt();
        e.newState(av, mv);
        System.out.print("Election Results for Conneticut:\nAwbrey: ");
        av = sc.nextInt();
        System.out.print("Martiez: ");
        mv = sc.nextInt();
        e.newState(av, mv);
        e.calc();
        System.out.print(e);
    }
}
