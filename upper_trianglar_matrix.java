import java.util.Scanner;

public class upper_trianglar_matrix {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.println("Enter the base of square matrix");
        n = sc.nextInt();
       int a[][] = new int[n][n];

       System.out.println("Enter the elements of matrix: ");
       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            a[i][j] = sc.nextInt();
        }
       }
       
       System.out.println("The upper triangular matrix is: ");
       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i<j){
               

                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
       }
       

    }
}
