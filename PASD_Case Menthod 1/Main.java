import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        Student[] students = {
                new Student("22001", "Andi", "Informatics Engineering"),
                new Student("22002", "Budi", "Informatics Engineering"),
                new Student("22003", "Citra", "Business Information Systems")
        };

        Book[] books = {
                new Book("B001", "Algorithm", 2020),
                new Book("B002", "Database", 2019),
                new Book("B003", "Programming", 2021),
                new Book("B004", "Physics", 2024)
        };

        Loan[] loans = {
                new Loan(students[0], books[0], 7),
                new Loan(students[1], books[1], 3),
                new Loan(students[2], books[2], 10),
                new Loan(students[2], books[3], 6),
                new Loan(students[0], books[1], 4)
        };

        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Show Students & Books");
            System.out.println("2. Show Loan Data");
            System.out.println("3. Show Fine Calculation");
            System.out.println("4. Sort by Highest Fine");
            System.out.println("5. Search by NIM");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showStudents(students);
                    showBooks(books);
                    break;
                case 2:
                    showLoans(loans);
                    break;
                case 3:
                    showFines(loans);
                    break;
                case 4:
                    insertionSort(loans);
                    System.out.println("Sorted by highest fine!");
                    showLoans(loans);
                    break;
                case 5:
                    searchByNIM(loans);
                    break;
            }

        } while (choice != 0);
    }

    static void showStudents(Student[] students) {
        System.out.println("\n=== STUDENTS ===");
        for (Student s : students) {
            s.display();
        }
    }

    static void showBooks(Book[] books) {
        System.out.println("\n=== BOOKS ===");
        for (Book b : books) {
            b.display();
        }
    }

    static void showLoans(Loan[] loans) {
        System.out.println("\n=== LOANS ===");
        for (Loan l : loans) {
            l.display();
        }
    }

    static void showFines(Loan[] loans) {
        System.out.println("\n=== FINES ===");
        for (Loan l : loans) {
            int late = Math.max(0, l.days - 5);
            System.out.println(l.student.name + " | Late: " + late + " days | Fine: " + l.fine);
        }
    }

    // INSERTION SORT
    static void insertionSort(Loan[] loans) {
        for (int i = 1; i < loans.length; i++) {
            Loan key = loans[i];
            int j = i - 1;

            while (j >= 0 && loans[j].fine < key.fine) {
                loans[j + 1] = loans[j];
                j--;
            }
            loans[j + 1] = key;
        }
    }

    // BINARY SEARCH
    static void searchByNIM(Loan[] loans) {
        System.out.print("Enter NIM: ");
        String nim = sc.next();

        sortByNIM(loans);

        int left = 0, right = loans.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (loans[mid].student.nim.equals(nim)) {
                System.out.println("Found:");
                loans[mid].display();
                found = true;
                break;
            } else if (loans[mid].student.nim.compareTo(nim) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Data not found!");
        }
    }


    static void sortByNIM(Loan[] loans) {
        for (int i = 0; i < loans.length - 1; i++) {
            for (int j = 0; j < loans.length - i - 1; j++) {
                if (loans[j].student.nim.compareTo(loans[j + 1].student.nim) > 0) {
                    Loan temp = loans[j];
                    loans[j] = loans[j + 1];
                    loans[j + 1] = temp;
                }
            }
        }
    }
}