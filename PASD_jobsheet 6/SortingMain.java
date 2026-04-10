public class SortingMain {
    public static void main(String[] args) {

        int a[] = {5, 3, 8, 4, 2};
        Sorting sorting1 = new Sorting(a, a.length);

        System.out.println("Bubble Sort:");
        sorting1.bubbleSort();
        sorting1.print();

        int b[] = {9, 1, 6, 7, 3};
        Sorting sorting2 = new Sorting(b, b.length);

        System.out.println("Selection Sort:");
        sorting2.selectionSort();
        sorting2.print();

        int c[] = {10, 4, 2, 8, 6};
        Sorting sorting3 = new Sorting(c, c.length);

        System.out.println("Insertion Sort:");
        sorting3.insertionSort();
        sorting3.print();
    }
}