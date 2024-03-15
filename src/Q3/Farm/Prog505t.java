package Q3.Farm;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog505t.dat"));
            ArrayList<Horse> horses = new ArrayList<Horse>();
            ArrayList<Cow> cows = new ArrayList<Cow>();
            int hay = sc.nextInt();
            double hayCost = sc.nextDouble();
            int corn = sc.nextInt();
            double cornCost = sc.nextDouble();

            int cowPens = sc.nextInt();
            for (int p = 0; p < cowPens; p++) {
                String name = "Bob";
                int weight = sc.nextInt();
                int milk = sc.nextInt();
                int hayEaten = sc.nextInt();
                int cornEaten = sc.nextInt();
                Cow bob = new Cow(name, weight, milk, hayEaten, cornEaten);
                cows.add(bob);
            }

            int horsePens = sc.nextInt();
            for (int p = 0; p < horsePens; p++) {
                String name = "George";
                int weight = sc.nextInt();
                int hayEaten = sc.nextInt();
                int cornEaten = sc.nextInt();
                int rides = sc.nextInt();
                double rideCost = sc.nextDouble();
                Horse george = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                horses.add(george);
            }
            Farm farm = new Farm(horses, cows, hay, corn, hayCost, cornCost);
            System.out.println("Today's income: " + (farm.cowIncome(cows.get(0).getMilkPrice()) + farm.horseIncome()));

            int cEaten = 0;
            int hEaten = 0;
            for (Horse h : horses) {
                cEaten += h.getCorn();
                hEaten += h.getHay();
            }
            for (Cow c : cows) {
                cEaten += c.getCorn();
                hEaten += c.getHay();
            }
            System.out.println("Cost of feeding the animals: " + (cEaten * cornCost + hEaten * hayCost));


            System.out.println("Total weight of the animals: " + farm.getWeight());

            if (farm.feedAllAnimals()) {
                System.out.println("The animals can be fed.");
                System.out.println("Hay left: " + (hay - hEaten));
                System.out.println("Corn left: " + (corn - cEaten));
            } else {
                System.out.println("There isn't enough food to feed the animals :(");
                System.out.println("Needed corn: " + (Math.abs(corn-cEaten)));
                System.out.println("Needed hay: " + (Math.abs(hay-hEaten)));
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}