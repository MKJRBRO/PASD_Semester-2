class LecturerData {
    Lecturer[] data = new Lecturer[10];
    int idx = 0;

    void add(Lecturer l) {
        data[idx++] = l;
    }

    void print() {
        for (int i = 0; i < idx; i++) {
            data[i].print();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (data[j].age > data[j + 1].age) {
                    Lecturer temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (data[j].age > data[max].age) {
                    max = j;
                }
            }
            Lecturer temp = data[max];
            data[max] = data[i];
            data[i] = temp;
        }
    }
}