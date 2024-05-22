import java.util.Scanner;

public class function_table {
    public static int printTable(int n){
        
        for(int i=1; i<=10; i++){
            t = n*i;
             
        }
        
        return t;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int t;
       int n = sc.nextInt();
       
       System.out.println(t);
       
    }
}
