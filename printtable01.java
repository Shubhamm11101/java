import java.util.Scanner;

public class printtable01 {
    public static void main(String args[]){
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println("Table of the number is: ");
        

        for(int i=10; i>=1; i--){
           System.out.printf("%d x %d = %d", n,i, n*i);
            System.out.println("\n");
          
        }

        
    }
}
