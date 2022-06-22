import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        var arrayListString = new ArrayList<String>() {{
            add("Hello");
            add("I");
            add("am");
            add("ArrayList");
            add(1, ",");
            add(4, "not");
        }};
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
