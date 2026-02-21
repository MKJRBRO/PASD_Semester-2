public class dosenMain01 {
    public static void main(String[] args) {
        
        lecturer dosen1 = new lecturer();
        dosen1.idlecturer = "67125367";
        dosen1.name = "Nero";
        dosen1.activeStatus = true;
        dosen1.yearOfEntry = 2025;
        dosen1.expertiseCompetency = "Teknik Informatika";

        lecturer dosen2 = new lecturer();
        dosen2.idlecturer = "1923619";
        dosen2.name = "Caligula";
        dosen2.activeStatus = false;
        dosen2.yearOfEntry = 2021;
        dosen2.expertiseCompetency = "Teknik Elektro";


        dosen1.setActiveStatus(true);
        dosen1.changeSkill("Teknik Kimia");
        dosen1.displayInformation();
        dosen2.setActiveStatus(false);
        dosen2.displayInformation();
    }
}
