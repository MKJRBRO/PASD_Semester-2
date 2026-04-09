package PASD_jobsheet7;

public class SortMain01 {
    public static void main(String[] args) {
        int data[] = {5, 2, 9, 1, 3};

        MergeSort01 ms = new MergeSort01();

        System.out.println("Before sorting:");
        ms.printArray(data);

        ms.sort(data, 0, data.length - 1);

        System.out.println("After sorting:");
        ms.printArray(data);
    }
}