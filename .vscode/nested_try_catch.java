import java.util.Scanner;

public class nested_try_catch {
    public static void  main(String args[]){
        int marks[] = new int[3];
        marks[0] = 24;
        marks[1] = 56;
        marks[2] = 50;
    
      Scanner sc = new Scanner(System.in);
      Boolean flag = true;
      while(flag){
      System.out.println("Enter the value of the index");
      int ind = sc.nextInt();
      try{
        System.out.println("Hello this is me Alone: ");
        try{
            System.out.println(marks[ind]);
            flag = false;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry this index does not exist");
            System.out.println("Exception in level 2");
        }
      }
      catch(Exception e){
        System.out.println("Exception in level 1: ");
      }
    }
    System.out.println("End of program");
}
}
