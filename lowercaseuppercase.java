import java.util.Scanner;

public class lowercaseuppercase {
   public static void main(String args[]){
    System.out.println("Enter any character");
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);

    if(ch>=97 && ch<=122){
        System.out.println("lowercase");
    } 
     else if(ch>=65 && ch<=90){
        System.out.println("Uppercase");
     }
     else{
        System.out.println("Not a character");
     }
    


   } 
}
