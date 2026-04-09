package PASD_jobsheet7;

public class SearchStudent01 {
    Students01[] listStd = new Students01[5];
    int idx;

    void add(Students01 mhs) {
        if (idx < listStd.length) {
            listStd[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void display() {
        for (Students s : listStd) {
            s.display();
        }
    }

    int findSeqSearch(int cari) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == cari) {
                position = i;
                break;
            }
        }
        return position;
    }

    void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data with NIM " + x + " found at index " + pos);
        } else {
            System.out.println("Data not found");
        }
    }

    void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM  : " + x);
            System.out.println("Name : " + listStd[pos].name);
            System.out.println("Age  : " + listStd[pos].age);
            System.out.println("GPA  : " + listStd[pos].gpa);
        } else {
            System.out.println("Data not found");
        }
    }

    int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;

            if (listStd[mid].nim == cari) {
                return mid;
            } else if (listStd[mid].nim > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}