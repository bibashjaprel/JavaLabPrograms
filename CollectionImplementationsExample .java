import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionImplementationsExample {

    public static void main(String[] args) {
        // ArrayList example
        arrayListExample();

        // LinkedList example
        linkedListExample();

        // TreeSet example
        treeSetExample();
    }

    // ArrayList example
    public static void arrayListExample() {
        // Creating an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Accessing elements
        System.out.println("ArrayList Elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Removing an element
        arrayList.remove("Banana");

        System.out.println("ArrayList Elements after removal:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }

    // LinkedList example
    public static void linkedListExample() {
        // Creating a LinkedList of Integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Accessing elements
        System.out.println("\nLinkedList Elements:");
        for (int number : linkedList) {
            System.out.println(number);
        }

        // Removing an element
        linkedList.remove(1); // Remove element at index 1

        System.out.println("LinkedList Elements after removal:");
        for (int number : linkedList) {
            System.out.println(number);
        }
    }

    // TreeSet example
    public static void treeSetExample() {
        // Creating a TreeSet of Integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(70);
        treeSet.add(20);

        // Accessing elements (naturally sorted order)
        System.out.println("\nTreeSet Elements:");
        for (int number : treeSet) {
            System.out.println(number);
        }

        // Removing an element
        treeSet.remove(30);

        System.out.println("TreeSet Elements after removal:");
        for (int number : treeSet) {
            System.out.println(number);
        }
    }
}
