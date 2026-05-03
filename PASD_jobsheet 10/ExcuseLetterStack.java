public class ExcuseLetterStack {
    ExcuseLetter[] stack;
    int top, size;

    public ExcuseLetterStack(int size) {
        this.size = size;
        stack = new ExcuseLetter[size];
        top = -1;
    }

    void push(ExcuseLetter e) {
        if (top < size - 1) {
            stack[++top] = e;
        }
    }

    ExcuseLetter pop() {
        if (top >= 0) return stack[top--];
        return null;
    }

    ExcuseLetter peek() {
        if (top >= 0) return stack[top];
        return null;
    }

    void search(String name) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + name);
                return;
            }
        }
        System.out.println("Not found");
    }
}