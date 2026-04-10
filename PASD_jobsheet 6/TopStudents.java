class TopStudents {
    Student[] listStudents = new Student[5];
    int idx = 0;

    void add(Student s) {
        if (idx < listStudents.length) {
            listStudents[idx] = s;
            idx++;
        }
    }

    void print() {
        for (int i = 0; i < idx; i++) {
            listStudents[i].print();
        }
    }

    // Bubble Sort (DESC GPA)
    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listStudents[j].gpa < listStudents[j + 1].gpa) {
                    Student temp = listStudents[j];
                    listStudents[j] = listStudents[j + 1];
                    listStudents[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort (ASC GPA)
    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int min = i;
            for (int j = i + 1; j < idx; j++) {
                if (listStudents[j].gpa < listStudents[min].gpa) {
                    min = j;
                }
            }
            Student temp = listStudents[min];
            listStudents[min] = listStudents[i];
            listStudents[i] = temp;
        }
    }

    // Insertion Sort (ASC GPA)
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Student temp = listStudents[i];
            int j = i - 1;

            while (j >= 0 && listStudents[j].gpa > temp.gpa) {
                listStudents[j + 1] = listStudents[j];
                j--;
            }
            listStudents[j + 1] = temp;
        }
    }
}