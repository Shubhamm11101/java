import java.util.Scanner;



public class fibonacci {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int a = 0, b=1;

    System.out.print(a+" ");


    if(n>1){
        for(int i=2; i<n; i++){
        System.out.print(b+" "); 
        int temp = 0;
        temp = b;
        b = a+b;
        a = temp;
        }
        System.out.println(b);
    }8
    }
    }

