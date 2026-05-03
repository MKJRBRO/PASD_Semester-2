import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentAssignmentStack stack = new StudentAssignmentStack(5);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.println("5. View First Assignment");
            System.out.print("Choose: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class: ");
                    String cls = scan.nextLine();

                    Student s = new Student(nim, name, cls);
                    stack.push(s);
                    System.out.println(name + "'s assignment submitted!");
                    break;

                case 2:
                    Student graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading " + graded.name);
                        System.out.print("Grade: ");
                        int g = scan.nextInt();
                        graded.grading(g);

                        System.out.println("Grade = " + g);
                        String binary = stack.convertToBinary(g);
                        System.out.println("Binary = " + binary);
                    }
                    break;

                case 3:
                    Student top = stack.peek();
                    if (top != null) {
                        System.out.println("Top: " + top.name);
                    }
                    break;

                case 4:
                    stack.print();
                    break;

                case 5:
                    Student first = stack.getFirst();
                    if (first != null) {
                        System.out.println("First: " + first.name);
                    }
                    break;
            }

        } while (choice != 0);
    }
}