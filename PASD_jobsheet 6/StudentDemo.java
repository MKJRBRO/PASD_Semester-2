public class StudentDemo {
    public static void main(String[] args) {

        TopStudents data = new TopStudents();

        data.add(new Student("001", "Andi", "A", 3.5));
        data.add(new Student("002", "Budi", "A", 3.8));
        data.add(new Student("003", "Cici", "B", 3.2));
        data.add(new Student("004", "Dedi", "B", 3.9));
        data.add(new Student("005", "Eka", "C", 3.4));

        System.out.println("Before Sorting:");
        data.print();

        System.out.println("\nAfter Bubble Sort (DESC):");
        data.bubbleSort();
        data.print();

        System.out.println("\nAfter Selection Sort (ASC):");
        data.selectionSort();
        data.print();

        System.out.println("\nAfter Insertion Sort (ASC):");
        data.insertionSort();
        data.print();
    }
}