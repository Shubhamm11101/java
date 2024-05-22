import java.util.Scanner;

public class practice01 {
    public static void main(String args[]){
        // byte a,b,c;
        // Scanner sc = new Scanner(System.in);
         
         
        // System.out.println("Enter the marks of subject a");
        // a = sc.nextByte();

        // System.out.println("Enter the marks of subject b");
        // b = sc.nextByte();

        // System.out.println("Enter the marks of subject c");
        // c = sc.nextByte();
        
        // float avg = (a+b+c)/3.0f;
        // System.out.println("Percentages : " + avg);

        // if(avg>=40 && a>=33 && b>=33 && c>=33){
        // System.out.println("Passed");
        // } else 
        // {
        // System.out.println("Failed");
        // }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("amount");
        float amount = sc.nextFloat();
        float tax = 0;
        
         

        if(amount<250000){
            System.out.println("No Income Tax");
        }

        else if(amount>250000 && amount<500000) {

        tax = amount*.5f;
        System.out.println("tax");

        }
        else if(amount>500000 && amount<100000){
        tax = amount*.20f;
        System.out.println("tax");

        }

        else {
        tax = amount*.30f;
        System.out.println("tax");

        }
            


        
    }
}
