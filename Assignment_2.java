import java.util.Scanner;

public class Assignment_2 {

    static Scanner input = new Scanner(System.in);

    public static void inputSchedule(String[][] schedule, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nSchedule " + (i + 1));

            System.out.print("Course Name  : ");
            schedule[i][0] = input.nextLine();

            System.out.print("Room         : ");
            schedule[i][1] = input.nextLine();

            System.out.print("Lecture Day  : ");
            schedule[i][2] = input.nextLine();

            System.out.print("Lecture Hour : ");
            schedule[i][3] = input.nextLine();
        }
    }

    public static void displayAll(String[][] schedule, int n) {
        System.out.println("\n===== FULL LECTURE SCHEDULE =====");
        System.out.printf("%-20s %-15s %-10s %-15s\n", 
                          "Course", "Room", "Day", "Hour");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-10s %-15s\n",
                    schedule[i][0],
                    schedule[i][1],
                    schedule[i][2],
                    schedule[i][3]);
        }
    }

    public static void displayByDay(String[][] schedule, int n, String day) {
        System.out.println("\nSchedule on " + day + ":");

        for (int i = 0; i < n; i++) {
            if (schedule[i][2].equalsIgnoreCase(day)) {
                System.out.println(schedule[i][0] + " - " 
                        + schedule[i][1] + " - "
                        + schedule[i][3]);
            }
        }
    }

    public static void displayByCourse(String[][] schedule, int n, String course) {
        System.out.println("\nSchedule for course: " + course);

        for (int i = 0; i < n; i++) {
            if (schedule[i][0].equalsIgnoreCase(course)) {
                System.out.println("Room : " + schedule[i][1]);
                System.out.println("Day  : " + schedule[i][2]);
                System.out.println("Hour : " + schedule[i][3]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter number of lecture schedules: ");
        int n = Integer.parseInt(input.nextLine());

        String[][] schedule = new String[n][4];

        inputSchedule(schedule, n);
        displayAll(schedule, n);

        System.out.print("\nEnter day to search: ");
        String searchDay = input.nextLine();
        displayByDay(schedule, n, searchDay);

        System.out.print("\nEnter course name to search: ");
        String searchCourse = input.nextLine();
        displayByCourse(schedule, n, searchCourse);
    }
}
