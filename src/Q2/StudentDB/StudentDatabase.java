package Q2.StudentDB;
import java.util.*;

public class StudentDatabase {
    public static int indexOfStu(ArrayList<Student> db, int id) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++) {
            if (db.get(lcv).getId() == id) index = lcv;
        }
        return index;
    }
    public static int indexOfStu(ArrayList<Student> db, String last) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++) {
            if (db.get(lcv).getLastName().equals(last)) index = lcv;
        }
        return index;
    }
    public static void printStu(Student stu) {
        System.out.printf("%s\t%s\t%d\t%.2f\n",
                stu.getFirstName(), stu.getLastName(), stu.getId(), stu.getGPA());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> db = new ArrayList<>();

        while (true) {
            System.out.println("\nStudent Menu");
            System.out.println("1 - Add new student");
            System.out.println("2 - Display all students");
            System.out.println("3 - Search for student (by id)");
            System.out.println("4 - Search for student (by last name)");
            System.out.println("5 - Modify a student's GPA");
            System.out.println("6 - Remove student by id");
            System.out.println("7 - Exit\n\nPlease enter your choice: ");
            int c = input.nextInt();

            if (c == 1) {
                System.out.print("First name: ");
                String first = input.next();
                System.out.print("Last name: ");
                String last = input.next();
                System.out.print("ID: ");
                int id = input.nextInt();
                System.out.print("GPA: ");
                double gpa = input.nextDouble();
                Student st = new Student(first, last, id, gpa);
                db.add(st);
            } else if (c == 2) {
                System.out.println("First\tLast\tID\tGPA");
                for (Student stu: db) {
                    printStu(stu);
                }
            } else if (c == 3) {
                System.out.print("ID: ");
                int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index != -1) printStu(db.get(index));
                else System.out.println("No student was found with that ID.");
            } else if (c == 4) {
                System.out.print("Last name: ");
                String ln = input.next();
                int index = indexOfStu(db, ln);
                if (index != -1) printStu(db.get(index));
                else System.out.println("No student was found with that last name.");
            } else if (c == 5) {
                System.out.print("ID: ");
                int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index == -1) System.out.println("No student was found with that ID.");
                else {
                    System.out.print("GPA: ");
                    double gpa = input.nextDouble();
                    db.get(index).setGPA(gpa);
                    System.out.println("GPA updated successfully.");
                }
            }else if (c == 6) {
                System.out.print("ID: ");
                int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index != -1) { db.remove(index);}
                else System.out.println("No student was found with that ID.");
            } else if (c == 7) {
                return;
            }
        }
    }
}
