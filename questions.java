import java.util.Scanner;

public class questions {
    public static void main(String args[]){
        // 1. sum of three number
        // int a = 5;
        // int b = 9;
        // int c = 7;
        // int sum = a+b+c;
        // System.out.println("The sum of these number");
        // System.out.println(sum);
          
        // 2. find cgpa

        // float subject1 = 67;
        // float subject2 = 87;
        // float subject3 = 98;
        
        // float cgpa = (subject1+subject2+subject3)/30;
        // System.out.println("The average marks");
        // System.out.println(cgpa);
        
        // 3. Your name
        // System.out.println("What is your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(" SHello " + name + " have a good day ");
        
        // conversion of Kilometres to mile

        Scanner sc = new Scanner(System.in);
        float km = sc.nextInt();
        System.out.println("The Kilometers"); 
        System.out.println(km);
        
        double b = 1.609;
        double miles = km/b;
        System.out.println("The miles");
        System.out.println(miles);
    
    }
}
