package PASD_jobsheet7;

import java.util.Scanner;

public class MainStudent01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SearchStudent01 data = new SearchStudent01();

        data.add(new Students01(101, "Andi", 20, 3.5));
        data.add(new Students01(102, "Budi", 21, 3.6));
        data.add(new Students01(103, "Citra", 19, 3.7));
        data.add(new Students01(104, "Dina", 22, 3.8));
        data.add(new Students01(105, "Eko", 20, 3.4));

        System.out.println("=== Data Students ===");
        data.display();

        System.out.print("Input NIM to search (Sequential): ");
        int cari = sc.nextInt();

        int pos = data.findSeqSearch(cari);
        data.showPosition(cari, pos);
        data.showData(cari, pos);

        System.out.print("\nInput NIM to search (Binary): ");
        cari = sc.nextInt();

        pos = data.findBinarySearch(cari, 0, data.listStd.length - 1);
        data.showPosition(cari, pos);
        data.showData(cari, pos);
    }
}