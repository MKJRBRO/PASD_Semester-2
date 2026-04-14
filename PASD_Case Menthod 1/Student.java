public class Student {
    String nim, name, prodi;

    public Student(String nim, String name, String prodi) {
        this.nim = nim;
        this.name = name;
        this.prodi = prodi;
    }

    void display() {
        System.out.println(nim + " | " + name + " | " + prodi);
    }
}