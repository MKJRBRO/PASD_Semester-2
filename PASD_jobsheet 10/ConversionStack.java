public class ConversionStack {
    int[] binaryStack;
    int size;
    int top;

    public ConversionStack() {
        size = 32;
        binaryStack = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(int data) {
        if (!isFull()) {
            top++;
            binaryStack[top] = data;
        }
    }

    int pop() {
        if (!isEmpty()) {
            return binaryStack[top--];
        }
        return -1;
    }
}