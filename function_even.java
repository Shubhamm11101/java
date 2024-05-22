import java.util.Scanner;

public class function_even {
    public static void oddOrEven(int n){
        if(n%2==0){
        System.out.println("Even");
        return;
        }
        else{
            System.out.println("odd");
            return;
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        oddOrEven(n);

    }
}
