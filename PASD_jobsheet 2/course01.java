class course01 {
    String kodeCourse;
    String name;
    int credits;
    int numberOfHours;
    String status;

    void showInformation() {
        System.out.println("Kode Course: " + kodeCourse);
        System.out.println("Name: " + name);
        System.out.println("Credits: " + credits);
        System.out.println("Number of Hours: " + numberOfHours);
    }

    void updateSks(int newSks) {
        credits = newSks;
        System.out.println("Credits have been changed");
    }

    void addHours(int hours) {
        numberOfHours += hours;
    }

    void reduceHours(int hours) {
        if (numberOfHours < hours) {
            status = "Reduction can't be made";
            System.out.println(status);
        }else {
            numberOfHours -= hours;
        }
    }
}