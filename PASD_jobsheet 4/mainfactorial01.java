import java.util.Scanner;

public class mainfactorial01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();

        factorial01 fk = new factorial01();
        System.out.println("Nilai Faktorial " +nilai+ " Menggunakan BF: " +fk.faktorialBF_DoWhile(nilai));
        System.out.println("Nilai Faktorial " +nilai+ " Menggunakan DC: " +fk.faktorialDC(nilai));

        sc.close();
    }

}