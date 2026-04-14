public class Book {
    String code, title;
    int year;

    public Book(String code, String title, int year) {
        this.code = code;
        this.title = title;
        this.year = year;
    }

    void display() {
        System.out.println(code + " | " + title + " | " + year);
    }
}