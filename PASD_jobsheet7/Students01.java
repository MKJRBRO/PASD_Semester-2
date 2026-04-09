package PASD_jobsheet7;

public class Students01 {
    int nim;
    String name;
    int age;
    double gpa;

    Students01(int ni, String nm, int age, double gpa) {
        this.nim = ni;
        this.name = nm;
        this.age = age;
        this.gpa = gpa;
    }

    void display() {
        System.out.println("NIM  : " + nim);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("GPA  : " + gpa);
        System.out.println("----------------------");
    }
}