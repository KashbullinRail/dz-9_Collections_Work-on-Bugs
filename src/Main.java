import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println();

//        Example ArrayList **********
        ExampleArrayList exampleArrayList = new ExampleArrayList();
        exampleArrayList.add("Hello");
        exampleArrayList.add(",");
        exampleArrayList.add("I");
        exampleArrayList.add("am");
        exampleArrayList.add(",");
        exampleArrayList.add("Array");
        exampleArrayList.add("List");
        exampleArrayList.printArrayList();
        exampleArrayList.add("Example", 4);
        exampleArrayList.printArrayList();
        exampleArrayList.searchAndRemove(",");
        exampleArrayList.printArrayList();
        exampleArrayList.searchAndRemove("am");
        exampleArrayList.printArrayList();
        System.out.println();
//        Example LinkedList *********
        ExampleLinkedList exampleLinkedList = new ExampleLinkedList();
        exampleLinkedList.add("Hello");
        exampleLinkedList.add(",");
        exampleLinkedList.add("I");
        exampleLinkedList.add("am");
        exampleLinkedList.printLinkedList();
        exampleLinkedList.add("Example");
        exampleLinkedList.add("Linked");
        exampleLinkedList.add("Copy");
        exampleLinkedList.add("List");
        exampleLinkedList.printLinkedList();
        exampleLinkedList.searchAndRemove("Example");
        exampleLinkedList.printLinkedList();
        exampleLinkedList.searchAndRemove("Copy");
        exampleLinkedList.printLinkedList();
        System.out.println();




        var arrayListString = new ArrayList<String>() {{
            add("Hello");
            add("I");
            add("am");
            add("ArrayList");
            add(1, ",");
            add(4, "not");
        }};
        System.out.println("***********************");
        for (String str : arrayListString) {
            System.out.print(str + " ");
        }

        // >>>>> Dz Search and remove ****************************************
        for (int i = 0; i < arrayListString.size(); i++) {
            if (arrayListString.get(i).equals("not")) {
                arrayListString.remove(i);
                i--;
            }
        }
        System.out.println();
        for (String str : arrayListString) {
            System.out.print(str + " ");
        }
        System.out.println();
        // <<<<< Dz Search and remove *****************************************

        var linkedListString = new LinkedList<String>() {{
            add("Hello");
            add("I");
            add("am");
            add("LinkedList");
            add(1, ",");
            add(4, "not");
        }};
//
        for (String str : linkedListString) {
            System.out.print(str + " ");
        }

        // >>>>> Dz Search and remove ****************************************
        for (int i = 0; i < linkedListString.size(); i++) {
            if (linkedListString.get(i).equals("not")) {
                linkedListString.remove(i);
                i--;
            }
        }
        System.out.println();
        for (String str : linkedListString) {
            System.out.print(str + " ");
        }
        System.out.println();
        // <<<<< Dz Search and remove *****************************************

    }
}
