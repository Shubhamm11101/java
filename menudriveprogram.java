import java.util.*;


public class menudriveprogram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input;
         
        do{
            int marks = sc.nextInt();
            if (marks >=90 && marks<=100){
                System.out.println("This is good");

            } else if(marks <= 89 && marks >=60){
                System.out.println("This is also good");

            } else if(marks <= 59 && marks >= 0){
               System.out.println("This is good as well");
            }else{
                System.out.println("Invaild");
            }
            System.out.println("Want to continue ? (yes(1)) or (no(0))");

            input = sc.nextInt();
            
            
        }while(input == 1);
    }
}
