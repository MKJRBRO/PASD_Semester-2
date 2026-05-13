public class Student {
    String nim;
    String name;
    String className;

    public Student(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
    }

    public void print() {
        System.out.println("NIM   : " + nim);
        System.out.println("Name  : " + name);
        System.out.println("Class : " + className);
    }
}