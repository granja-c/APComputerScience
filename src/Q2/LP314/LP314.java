package Q2.LP314;
import java.util.*;

public class LP314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cl314 e = new Cl314();
        System.out.print("Election Results for New York:\nAwbrey: ");
        int av = sc.nextInt();
        System.out.print("Martinez: ");
        int mv = sc.nextInt();
        e.newState(av, mv);
        System.out.print("Election Results for New Jersey:\nAwbrey: ");
        av = sc.nextInt();
        System.out.print("Martinez: ");
        mv = sc.nextInt();
        e.newState(av, mv);
        System.out.print("Election Results for Conneticut:\nAwbrey: ");
        av = sc.nextInt();
        System.out.print("Martinez: ");
        mv = sc.nextInt();
        e.newState(av, mv);
        e.calc();
        System.out.print(e);
    }
}
/*
Election Results for New York:
Awbrey: 314159
Martinez: 271860
Election Results for New Jersey:
Awbrey: 89008
Martinez: 121032
Election Results for Conneticut:
Awbrey: 213451
Martinez: 231034
Candidate	Votes	Percentage
Awbrey	616618	49.71
Martinez	623926	50.29
TOTAL VOTERS: 1240544
 */