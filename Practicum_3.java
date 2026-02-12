import java.util.Scanner;
public class Practicum_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Program menghitung IP Semester");
        System.out.println("=================================");

    
        System.out.print("Nilai Pancasila: ");
        double nilaiPancasila = sc.nextDouble();
        System.out.print("Nilai KTI: ");
        double nilaiKTI = sc.nextDouble();
        System.out.print("Nilai CTPS: ");
        double nilaiCTPS = sc.nextDouble();
        System.out.print("Nilai Math: ");
        double nilaiMath = sc.nextDouble();
        System.out.print("Nilai BING: ");
        double nilaiBING = sc.nextDouble();
        System.out.print("Nilai DASPRO: ");
        double nilaiDASPRO = sc.nextDouble();
        System.out.print("Nilai KDKK: ");
        double nilaiKDKK = sc.nextDouble();

        double NilaiRata = (nilaiPancasila + nilaiKTI + nilaiCTPS + nilaiMath + nilaiBING + nilaiDASPRO + nilaiKDKK) / 7;

        System.out.println("=================================");
        System.out.printf("Nilai Akhir Semester: %.2f%n", NilaiRata);

        if (NilaiRata >= 80) {
                System.out.println("IP: 4.0");
            } else if (NilaiRata >= 73) {
                System.out.println("IP: 3.5");
            } else if (NilaiRata >= 65) {
                System.out.println("IP: 3.0");
            } else if (NilaiRata >= 60) {
                System.out.println("IP: 2.5");
            } else if (NilaiRata >= 50) {
                System.out.println("IP: 2.0");
            } else if (NilaiRata >= 39) {
                System.out.println("IP: 1.0");
            } else {
                System.out.println("IP: 0.0");
            }
        sc.close();
    }

}