package Q2.Prog410t;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/survey.dat"));

            while (sc.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
