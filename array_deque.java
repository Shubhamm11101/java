import java.util.*;


public class array_deque {
    public static void main(String args[]){
     ArrayDeque<Integer> a1 = new ArrayDeque<>();
     a1.add(1);
     a1.add(23);
     a1.add(45);
     a1.add(34);

    System.out.println("The ArrayDeque: "+a1);
    // Insertion at End
    // a1.addLast(10);
    // a1.offerLast(23);
    // System.out.println(a1);

    //Accessing an element from the head and tail of the deque array 
    // System.out.println(a1.getFirst());
    // System.out.println(a1.peekFirst());
    // System.out.println(a1.getLast());
    // System.out.println(a1.peekLast());

    //Removing the first element
    // a1.pollFirst();
    // a1.removeFirst();
    // System.out.println(a1);

    // Removing the last element
    // a1.pollLast();
    // a1.removeLast();
    // System.out.println(a1);

    }
}
