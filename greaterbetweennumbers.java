import java.util.Scanner;

public class greaterbetweennumbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        System.out.println("c");
        int c = sc.nextInt();

    if((a>b) && (a>c)){
        System.out.println("A is greater");
    } else if (b>c) 
    {
      System.out.println("B is greater");
    }
    else
    {
        System.out.println("C is greater");
    }

    }
}
