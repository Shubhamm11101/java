import java.util.*;

public class linked_list {
    public static void main(String args[]){
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(5,5);

        // l2.add(12);
        // l2.add(14);
        // l2.add(13);
        // l2.add(11);

        System.out.println("LinkedList before: " + l1);

        //remove the element
        // l1.remove(3);
        // System.out.println("LinkedList after removing"+ l1);

        // change the element of linkedlist
        // l1.set(2,7);
        // System.out.println("After changing the element in linkedlist"+l1);

        //insertion of element at the last
        // l1.addLast(15);
        // System.out.println("After inserting: "+ l1);  
        
        //insertion at the start
        // l1.addFirst(16);
        // System.out.println("After inserting: "+ l1);
    }
}
