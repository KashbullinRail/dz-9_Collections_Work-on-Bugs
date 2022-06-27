public class ExampleLinkedList {

    private int size;

    public static class Node {
        private Node prev;
        private String value;
        private Node next;

    }

    private Node first = new Node();
    private Node last = new Node();

    public ExampleLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;
        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
        size++;
    }

    public void printLinkedList() {
        for (int i = 0; i < size; i++) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }

    public void searchAndRemove(String str) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(str)) {
                remove(i);
            }
        }
    }

    public String get(int index) {
        int currentIndex = 0;
        Node currentElement = first.next;
        while ((currentElement) != null) {
            if (currentIndex == index) {
                return currentElement.value;
            }
            currentElement = currentElement.next;
            currentIndex++;
        }
        return null;
    }


    public void remove(int index) {
        Node x = first;
        for (int i = 0; i < index+1; i++) {
            x = x.next;
        }
        String element = x.value;
        Node next = x.next;
        Node prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }
        x.value = null;
        size--;
    }
}
