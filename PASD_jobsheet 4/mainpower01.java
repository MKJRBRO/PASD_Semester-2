import java.util.Scanner;
public class mainpower01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

       power01[] png = new power01[elemen];
        for (int i=0; i<elemen ;i++){
            System.out.print("Masukkan nilai basis elemen ke-" + ( i + 1 ) + ": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + ( i + 1 ) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new power01 (basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (power01 p : png) {
            System.out.println (p.nilai + "^" + p.pangkat +": "+ p.pangkatBFTanpaParam());

        }

        System.out.println("HASIL PANGKAT DEVIDE DAN CONQUER:");
        for (power01 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        
        }

        sc.close();
    }
}