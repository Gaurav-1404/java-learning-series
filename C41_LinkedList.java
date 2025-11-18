
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class C41_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> L1 = new LinkedList<>();
        LinkedList<Integer> L2 = new LinkedList<>();

        // Adding elements
        L1.add(5);
        L1.add(3);
        L1.add(4);
        L1.add(6);
        L1.add(1, 7);

        L2.add(50);
        L2.add(70);

        System.out.println("Second List: ");
        for (int i : L2)
            System.out.println(i);

        // addAll()
        L1.addAll(L2);

        // set()
        L1.set(1, 566);

        // size()
        System.out.println("Size of L1: " + L1.size());

        // get()
        System.out.println("Value at index 3: " + L1.get(3));

        // Iterating using enhanced loop
        System.out.println("\nL1 elements:");
        for (int i : L1)
            System.out.println(i);

        // contains()
        System.out.println("\nContains 27? " + L1.contains(27));

        // indexOf()
        System.out.println("Index of 7: " + L1.indexOf(7));

        // lastIndexOf()
        L1.add(70);   // to show lastIndexOf working
        System.out.println("Last index of 70: " + L1.lastIndexOf(70));

        // remove() by index
        L1.remove(2);
        System.out.println("\nAfter removing index 2: " + L1);

        // remove() by object
        L1.remove(Integer.valueOf(70));
        System.out.println("After removing 70 (first occurrence): " + L1);

        // Sorting the list
        Collections.sort(L1);
        System.out.println("\nSorted L1: " + L1);

        // subList()
        System.out.println("Sublist (0 to 3): " + L1.subList(0, 3));

        // clone()
        LinkedList<Integer> L3 = (LinkedList<Integer>) L1.clone();
        System.out.println("\nCloned List L3: " + L3);

        // isEmpty()
        System.out.println("Is L1 empty? " + L1.isEmpty());

        // clear()
        L2.clear();
        System.out.println("L2 after clear(): " + L2);

    }
}
