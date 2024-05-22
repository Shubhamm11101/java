import java.util.Scanner;

public class electricbill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units");
        int unit = sc.nextInt();
        float charge;
        float total;
        float grand;

        if(unit>50 && unit<149){
            charge = unit*.50f;
            System.out.println(charge);
            total = charge*0.2f;
            System.out.println(total);
            grand = charge + total;
            System.out.println("The Grand total is : ");
            System.out.println(grand);
       
        }  
        else if(unit>150 && unit<249){
            charge = unit*0.75f;
            System.out.println(charge);
            total = charge*0.2f;
            System.out.println(total);
            grand = charge + total;
            System.out.println("The Grand total is : ");
            System.out.println(grand);
            

        }
        else if(unit>250 && unit<499){
            charge = unit*1.20f;
            System.out.println(charge);
            total = charge*0.2f;
            System.out.println(total);
            grand = charge + total;
            System.out.println("The Grand total is : ");
            System.out.println(grand);
        
        }
        else if(unit>500){
            charge = unit*1.50f;
            System.out.println(charge);
            total = charge*0.2f;
            System.out.println(total);
            grand = charge + total;
            System.out.println("The Grand total is : ");
            System.out.println(grand);
            
    }
    else{
        System.out.println("No charge");
    }
}
}