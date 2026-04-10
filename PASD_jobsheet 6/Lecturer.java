class Lecturer {
    String id, name;
    boolean gender;
    int age;

    Lecturer(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void print() {
        System.out.println(id + " | " + name + " | " + (gender ? "Male" : "Female") + " | " + age);
    }
}