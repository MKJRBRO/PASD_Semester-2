public class Loan {
    Student student;
    Book book;
    int days;
    int fine;

    public Loan(Student student, Book book, int days) {
        this.student = student;
        this.book = book;
        this.days = days;
        calculateFine();
    }

    void calculateFine() {
        int late = days - 5;
        if (late > 0) {
            fine = late * 2000;
        } else {
            fine = 0;
        }
    }

    void display() {
        System.out.println(student.nim + " | " + student.name + " | "
                + book.title + " | " + days + " days | Fine: " + fine);
    }
}