import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue krs = new KRSQueue(10);
        int menu;

        do {
            System.out.println("\n--- KRS Approval System ---");
            System.out.println("1. Register Student (Enqueue)");
            System.out.println("2. Process KRS (Dequeue 2)");
            System.out.println("3. View First Two");
            System.out.println("4. View Last Student");
            System.out.println("5. Check Status/Quota");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    krs.enqueue(new Student(nim, name, "SIB", "1G"));
                    break;
                case 2:
                    krs.processKRS();
                    break;
                case 3:
                    krs.peekTwo();
                    break;
                case 4:
                    krs.viewRear();
                    break;
                case 5:
                    krs.displayStatus();
                    break;
            }
        } while (menu != 0);
    }
}