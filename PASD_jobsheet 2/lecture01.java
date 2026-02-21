class lecturer01 {
    String idlecturer;
    String name;
    boolean activeStatus;
    String statusDosen;
    int yearOfEntry;
    String expertiseCompetency;

    void displayInformation() {
        System.out.println("Lecturer ID: " + idlecturer);
        System.out.println("Name: " + name);
        System.out.println("Active Status: " + statusDosen);
        System.out.println("Year of Entry: " + yearOfEntry);
        System.out.println("Expertise Competency: " + expertiseCompetency);
    }

    void setActiveStatus(boolean status) {
        activeStatus = status;
        if (activeStatus == true) {
            statusDosen = "Aktif";
        }else {
            statusDosen = "Tidak aktif";
        }
    }
    
    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    void changeSkill(String skill) {
        expertiseCompetency = skill;
    }
}