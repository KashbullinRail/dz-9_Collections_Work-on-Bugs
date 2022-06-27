public class ExampleArrayList {
    private int size;
    private int capacity;
    private String[] elements;

    public ExampleArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    public void add(String element, int index) {
        if (size == capacity) {
            grow();
        }
        if (index >= 0 || index < size) {
            for (int i = size-1; i < index; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
        }
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        String[] a = new String[capacity];
        for (int i = 0; i < elements.length; i++) {
            a[i] = elements[i];
        }
        elements = a;
    }

    public void printArrayList() {
        for (String str : elements) {
            if (str != null) {
                System.out.print(str + " ");
            }
        }
        System.out.println();
    }

    public void searchAndRemove(String str) {
        for (int i = 0; i < size - 1; i++) {
            if (elements[i].equals(str)) {
                remove(i);
            }
        }
    }

    private void remove(int i) {
        for (int j = i; j < (size - 1); j++) {
            elements[j] = elements[j + 1];
            elements[j + 1] = null;
        }
        size--;
    }
}
