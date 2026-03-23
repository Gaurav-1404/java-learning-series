import java.util.ArrayDeque;

public class C43_ArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // --------------------------------------------
        // 1. add(), addFirst(), addLast()
        // --------------------------------------------
        dq.add(10);            // add at tail
        dq.addFirst(5);        // add at head
        dq.addLast(20);        // add at tail
        System.out.println("After add: " + dq);

        // --------------------------------------------
        // 2. offer(), offerFirst(), offerLast()
        // --------------------------------------------
        dq.offer(30);          // add at tail (returns true/false)
        dq.offerFirst(2);
        dq.offerLast(40);
        System.out.println("After offer: " + dq);

        // --------------------------------------------
        // 3. getFirst(), getLast()
        // --------------------------------------------
        System.out.println("First element: " + dq.getFirst());
        System.out.println("Last element: "  + dq.getLast());

        // --------------------------------------------
        // 4. peek(), peekFirst(), peekLast()
        // (returns null if empty)
        // --------------------------------------------
        System.out.println("Peek: " + dq.peek());
        System.out.println("Peek First: " + dq.peekFirst());
        System.out.println("Peek Last: " + dq.peekLast());

        // --------------------------------------------
        // 5. remove(), removeFirst(), removeLast()
        // --------------------------------------------
        System.out.println("Removed: " + dq.remove());
        System.out.println("Removed First: " + dq.removeFirst());
        System.out.println("Removed Last: " + dq.removeLast());
        System.out.println("After remove: " + dq);

        // --------------------------------------------
        // 6. poll(), pollFirst(), pollLast()
        // (returns null if empty)
        // --------------------------------------------
        System.out.println("Poll: " + dq.poll());
        System.out.println("Poll First: " + dq.pollFirst());
        System.out.println("Poll Last: " + dq.pollLast());
        System.out.println("After poll: " + dq);

        // --------------------------------------------
        // 7. push(), pop()  (Stack operations)
        // --------------------------------------------
        dq.push(100);   // same as addFirst()
        dq.push(200);
        System.out.println("After push: " + dq);

        System.out.println("Pop: " + dq.pop()); // same as removeFirst()
        System.out.println("After pop: " + dq);

        // --------------------------------------------
        // 8. contains(), size(), isEmpty(), clear()
        // --------------------------------------------
        dq.add(50);
        dq.add(60);
        System.out.println("Deque: " + dq);

        System.out.println("Contains 50? " + dq.contains(50));
        System.out.println("Size: " + dq.size());
        System.out.println("Is empty? " + dq.isEmpty());

        dq.clear();
        System.out.println("After clear: " + dq);
    }
}
