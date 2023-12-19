package Q2;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BigArrayList {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/bigarrayList.dat"));
            int numCats = sc.nextInt();
            sc.nextLine();
            ArrayList<Cat> cats = new ArrayList<>();

            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = sc.nextLine();
                double weight = sc.nextDouble();
                int age = sc.nextInt();
                double cost = sc.nextDouble();
                sc.nextLine();
                cats.add(new Cat(name, weight, age, cost));
            }
            System.out.println("All cats:\nName\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + cat.getCost());
            }
            System.out.println("The third cat: " + cats.get(2));
            cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight() + 10);
            System.out.println("Last cat's new weight: " + cats.get(cats.size() - 1));

            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getName().equals("Rascal")) {
                    cats.remove(lcv);
                }
            }
            cats.add(1, new Cat("Angel", 3.6, 1, 25.99));
            cats.add(new Cat("Gimpy", 14.3, 10, 29.99));
            for (Cat cat : cats) {
                System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + cat.getCost());
            }
            Cat temp = cats.get(2);
            cats.set(2, new Cat("Sugar", 23.6, 7, 33.25));

            Cat temp2 = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, temp2);
            System.out.println("Cat names: ");
            for (Cat c : cats) {
                System.out.print(c.getName() + "\t");
            }
            System.out.println();
            System.out.println("Cats being put on a diet are: ");
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                Cat cat = cats.get(lcv);
                if (cat.getWeight() > 15) {
                    System.out.print(cat.getName() + "\t");
                }
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
