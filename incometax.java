import java.util.Scanner;


public class incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("income");
        float income = sc.nextFloat();
       

        float tax;
        

        if(income>250 && income<500){
            tax = income*0.05f;
            System.out.println(tax);
        }
        else if(income>501 && income<1000){
            tax = income*0.2f;
            System.out.println("tax");
            System.out.println(tax);
            
        }
        
        else if(income>1000){
            tax = income*0.3f;
            System.out.println("tax");
            System.out.println(tax);
           
        } 
        else{
            System.out.println("No tax");
        }



    }
}
