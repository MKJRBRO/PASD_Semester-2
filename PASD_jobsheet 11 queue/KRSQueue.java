public class KRSQueue {
    Student[] data;
    int front, rear, size, max;
    int completedCount = 0;
    final int DPA_CAPACITY = 30;

    public KRSQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    void enqueue(Student std) {
        if (size + completedCount >= DPA_CAPACITY) {
            System.out.println("DPA has reached maximum capacity of 30 students!");
            return;
        }
        if (size < max) {
            rear = (rear + 1) % max;
            data[rear] = std;
            size++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    void processKRS() {
        if (isEmpty()) {
            System.out.println("No students to process.");
            return;
        }
       
        int toProcess = Math.min(size, 2);
        for (int i = 0; i < toProcess; i++) {
            Student s = data[front];
            System.out.println("Processing KRS for: " + s.name);
            front = (front + 1) % max;
            size--;
            completedCount++;
        }
    }

    boolean isEmpty() { return size == 0; }

    void displayStatus() {
        System.out.println("Total in queue: " + size);
        System.out.println("Completed: " + completedCount);
        System.out.println("Remaining DPA Quota: " + (DPA_CAPACITY - completedCount - size));
    }

    void peekTwo() {
        if (size >= 1) data[front].print();
        if (size >= 2) data[(front + 1) % max].print();
    }
    
    void viewRear() {
        if (!isEmpty()) data[rear].print();
    }
}