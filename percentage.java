import java.util.Scanner;

public class percentage {
    public static void main(String []ars){
        Scanner sc = new Scanner (System.in);

        
       
        System.out.println("Enter marks of subject a");
        float a = sc.nextInt();
        System.out.println("Enter marks of subject b");
        float b = sc.nextInt();
        System.out.println("Enter marks of subject c");
        float c = sc.nextInt();
        System.out.println("Enter marks of subject d");
        float d = sc.nextInt();
        System.out.println("Enter marks of subject e");
        float e = sc.nextInt();
        
        float total = a+b+c+d+e;
        System.out.println(total);

        float percentage = (total/500)*100;
        System.out.println("Percentage");
        System.out.println(percentage);































































        
    }
}
