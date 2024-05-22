import java.util.*;

public class array_list {
    public static void main(String args[]){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(5,5);

        l2.add(12);
        l2.add(14);
        l2.add(13);
        l2.add(11);

        System.out.println("ArrayList before: " + l1);
    

        //remove the elment
        // l1.remove(3);
        // System.out.println("ArrayList after removing the value at index 3: "+ l1);

        //check the element is in the list or not
        // System.out.println("ArrayList contains 7: " + l1.contains(7));
        // System.out.println("ArrayList contains 4: "+ l1.contains(4));

        //merging two arrays
        // System.out.println("ArrayList l2 is: "+ l2);
        // l1.addAll(l2);
        // System.out.println("L1 Array list after merging: "+ l1);

        //occurence of specified number  in ArrayList
       //= System.out.println("The first occurence of 3 in l1 is atindex: " + l1.indexOf(3));
        
    }
}
