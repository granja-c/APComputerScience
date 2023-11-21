package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BigArray2 {
    public static void printCat(Cat cat) {
        System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numcats = sc.nextInt();
            sc.nextLine();
            Cat[] cats = new Cat[50];

            for (int lcv = 0; lcv < numcats; lcv++) {
                String name = sc.nextLine();
                double weight = sc.nextDouble();
                int age = sc.nextInt();
                double cost = sc.nextDouble();
                sc.nextLine();
                cats[lcv] = new Cat(name, weight, age, cost);
            }
            System.out.println("\nAll the Cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (int lcv = 0; lcv < numcats; lcv++) {
                printCat(cats[lcv]);
            }
            System.out.println("The third cat is named: " + cats[2].getName());
            cats[numcats-1].setWeight(cats[numcats-1].getWeight() + 10);
            System.out.println("The updated weight is: " + cats[numcats-1].getWeight());
            int rascalIndex = 0;
            for (int lcv = 0; lcv < numcats; lcv++){
                if (cats[lcv].getName().equals("Rascal")) rascalIndex = lcv;
            }
            for (int lcv = rascalIndex; lcv < numcats-1; lcv++){
                cats[lcv] = cats[lcv+1];
            }
            numcats--;
            for (int lcv = numcats; lcv > 1; lcv--) {
                cats[lcv] = cats[lcv-1];
            }
            cats[1] = new Cat("Angel", 3.6, 1, 25.99);
            numcats++;

            cats[numcats] = new Cat("Gimpy", 14.3, 10, 29.99);
            numcats++;

            System.out.println("\nThe updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                if (cat != null) printCat(cat);
            }

            Cat temp = cats[2];
            cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
            cats[numcats] = temp;
            numcats++;

            Cat temp2 = cats[1];
            cats[1] = cats[3];
            cats[3] = temp2;

            System.out.println("\nThe updated list is: ");
            for (Cat cat : cats) {
                if (cat != null) printCat(cat);
            }
            System.out.println();

            int i = 0;
            while (i < numcats) {
                if (cats[i].getCost() < 26) {
                    for (int j = i; j < numcats-1; j++) {
                        cats[j] = cats[j+1];
                        numcats--;
                    }
                } else {
                    i++;
                }
            }
            System.out.println("Cat prices above $26: ");
            for (int lcv = 0; lcv < numcats; lcv++) {
                System.out.print(cats[lcv].getCost() + " ");
            }
            System.out.println();

            for (int lcv = 0; lcv < numcats; lcv++) {
                if (cats[lcv].getWeight() > 15) System.out.print(cats[lcv].getName() + "\t");;
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
/*
All the Cats:
Name	Weight	Age	Cost
Inky	15.69	2	35.79
Panda	14.3	6	15.03
Rascal	21.1	21	0.0
Blacky	13.99	3	26.89
Taffy	24.5	10	56.89
Toby	17.2	10	37.57
The third cat is named: Rascal
The updated weight is: 27.2

The updated list is:
Name	Weight	Age	Cost
Inky	15.69	2	35.79
Angel	3.6	1	25.99
Panda	14.3	6	15.03
Blacky	13.99	3	26.89
Taffy	24.5	10	56.89
Toby	27.2	10	37.57
Gimpy	14.3	10	29.99

The updated list is:
Inky	15.69	2	35.79
Blacky	13.99	3	26.89
Sugar	23.6	7	33.25
Angel	3.6	1	25.99
Taffy	24.5	10	56.89
Toby	27.2	10	37.57
Gimpy	14.3	10	29.99
Panda	14.3	6	15.03

Cat prices above $26:
35.79 26.89 33.25 56.89 37.57 37.57
Inky	Sugar	Taffy	Toby

 */