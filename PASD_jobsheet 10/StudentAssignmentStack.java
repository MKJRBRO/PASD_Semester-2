public class StudentAssignmentStack {
    Student[] stack;
    int size;
    int top;

    public StudentAssignmentStack(int size) {
        this.size = size;
        top = -1;
        stack = new Student[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Student std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    Student pop() {
        if (!isEmpty()) {
            Student std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("Stack is empty!!");
            return null;
        }
    }

    Student peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty!!");
            return null;
        }
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
        }
    }

    int count() {
        return top + 1;
    }


    Student getFirst() {
        if (!isEmpty()) {
            return stack[0];
        }
        return null;
    }

    String convertToBinary(int grade) {
        ConversionStack stack = new ConversionStack();
        while (grade > 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }

        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }
}