import java.util.Scanner;

public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data Dosen : ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        System.out.println("==========================================");

        Dosen01[] arrayOfDosen01 = new Dosen01[jumlahDosen];

        String  kode, nama, dummy;
        Boolean jenisKelamin;
        int     usia;

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode                : ");
            kode = sc.nextLine();

            System.out.print("Nama                : ");
            nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P) : ");
            dummy        = sc.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("L");

            System.out.print("Usia                : ");
            usia = Integer.parseInt(sc.nextLine());

            System.out.println("------------------------------------------");

            arrayOfDosen01[i] = new Dosen01(kode, nama, jenisKelamin, usia);
        }

 
        DataDosen01 dataDosen01 = new DataDosen01();


        dataDosen01.dataSemuaDosen(arrayOfDosen01);

        dataDosen01.jumlahDosenPerJenisKelamin(arrayOfDosen01);

        dataDosen01.rerataUsiaDosenPerJenisKelamin(arrayOfDosen01);

        dataDosen01.infoDosenPalingTua(arrayOfDosen01);

        dataDosen01.infoDosenPalingMuda(arrayOfDosen01);

        sc.close();
    }
}