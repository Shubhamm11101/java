import java.util.Scanner;

public class average {
     static float average(int a, int b, int c){
     float avg = (a+b+c)/3;
     return avg;

    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number a");
       int a = sc.nextInt();
       System.out.println("Enter a number b");
       int b = sc.nextInt();
       System.out.println("Enter a number c");
       int c = sc.nextInt();
      
       System.out.println(average(a, b, c));
    
    }
}
