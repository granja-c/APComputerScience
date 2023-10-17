package Q1.prog213bCl;
import java.io.IOException;
import java.util.*;
import java.io.File;

public class prog213bCl {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog213b.txt"));
            int quant = 0;
            while (sc.hasNext()) {
                quant = sc.nextInt();
                Cl213b x = new Cl213b(quant);
                x.calc();

                System.out.println(x);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
Price = $5.95	Amount Due = $89.25
Price = $5.95	Amount Due = $267.75
Price = $5.95	Amount Due = $327.25
Price = $5.95	Amount Due = $333.20
Price = $5.95	Amount Due = $249.90
Price = $5.75	Amount Due = $661.25
Price = $5.95	Amount Due = $547.40
Price = $5.95	Amount Due = $184.45
Price = $5.95	Amount Due = $446.25
Price = $5.95	Amount Due = $285.60
Price = $5.95	Amount Due = $345.10
Price = $5.95	Amount Due = $5.95
Price = $5.95	Amount Due = $148.75
Price = $5.95	Amount Due = $95.20
Price = $5.95	Amount Due = $113.05
 */