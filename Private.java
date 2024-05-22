import java.util.*;
public class Private {
    Private()
    {
        System.out.println("this is demo of constructor");
    }
    

    public static void main(String args[])
    {
        int a =0,b=0;
        Private p = new Private();
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        System.out.println("Enter another number");
        b=sc.nextInt();
        Private p1 = new Private(a,b);
        
      
     

    
    }
    Private(int a , int b)
    {
       int c = a+b;
       System.out.println("Sum of numbers" +c);
      
    }
}
   


