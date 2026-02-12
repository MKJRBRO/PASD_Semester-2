import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        char[] kode = {'A','B','D','E','F','G','H','L','N','T'};

        
        String[] kota = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL"
        };

        
        System.out.print("Masukkan kode plat: ");
        char inputKode = input.next().toUpperCase().charAt(0);

        
        boolean ketemu = false;

        for (int i = 0; i < kode.length; i++) {
            if (inputKode == kode[i]) {
                System.out.println("Kota: " + kota[i]);
                ketemu = true;
            }
        }

        
        if (ketemu == false) {
            System.out.println("Kode tidak ditemukan");
        }

        input.close();
    }
}