public class mainstudent01 {

    static int utsMaxDC(student01[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMax = utsMaxDC(arr, l, mid);
        int rightMax = utsMaxDC(arr, mid + 1, r);
        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    static int utsMinDC(student01[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMin = utsMinDC(arr, l, mid);
        int rightMin = utsMinDC(arr, mid + 1, r);
        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
        }
    }

    static double uasRataBF(student01[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i].nilaiUAS;
        }
        return total / arr.length;
    }

    public static void main(String[] args) {
        student01[] mhs = {
            new student01("Ahmad", "220101001", 2022, 78, 82),
            new student01("Budi",  "220101002", 2022, 85, 88),
            new student01("Cindy", "220101003", 2021, 90, 87),
            new student01("Dian",  "220101004", 2021, 76, 79),
            new student01("Eko",   "220101005", 2023, 92, 95),
            new student01("Fajar", "220101006", 2020, 88, 85),
            new student01("Gina",  "220101007", 2023, 80, 83),
            new student01("Hadi",  "220101008", 2020, 82, 84)
        };

        int n = mhs.length;

        System.out.println("a) Nilai UTS Tertinggi (Divide and Conquer): " + utsMaxDC(mhs, 0, n - 1));
        System.out.println("b) Nilai UTS Terendah  (Divide and Conquer): " + utsMinDC(mhs, 0, n - 1));
        System.out.println("c) Rata-rata Nilai UAS (Brute Force)       : " + uasRataBF(mhs));
    }
}