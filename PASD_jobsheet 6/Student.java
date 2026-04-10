class Student {
    String nim, name, studentClass;
    double gpa;

    Student() {}

    Student(String nim, String name, String studentClass, double gpa) {
        this.nim = nim;
        this.name = name;
        this.studentClass = studentClass;
        this.gpa = gpa;
    }

    void print() {
        System.out.println(nim + " | " + name + " | " + studentClass + " | " + gpa);
    }
}