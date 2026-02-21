public class courseMain01 {
    public static void main(String[] args) {
        
        course matKul1 = new course();
        matKul1.kodeCourse = "12812358";
        matKul1.name = "Algoritma Struktur Data";
        matKul1.credits = 15;
        matKul1.numberOfHours = 6;

        course matkul2 = new course();
        matkul2.kodeCourse = "12683512";
        matkul2.name = "Matematika Lanjut";
        matkul2.credits = 15;
        matkul2.numberOfHours = 8;
        
        matKul1.updateSks(5);
        matKul1.addHours(4);
        matKul1.reduceHours(1);
        matKul1.showInformation();

        matkul2.updateSks(10);
        matkul2.addHours(5);
        matkul2.reduceHours(3);
        matkul2.showInformation();
        

    }
}