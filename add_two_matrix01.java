import java.util.Scanner;

public class add_two_matrix01 {
    public static void main(String args[]){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base of matrix");
    n = sc.nextInt();

    int a[][] = new int[n][n];
    int b[][] = new int[n][n];
    int c[][] = new int[n][n];

    System.out.println("ENter the element of 1st a=matrix: ");
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
         a [i][j] = sc.nextInt();
        }
    }
    System.out.println("Enter the element of 2nd matrix: ");
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            b[i][j] = sc.nextInt();
        }
    }
    System.out.println("The sum of two matrix is: ");
    for (int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            c[i][j] = a[i][j] + b[i][j];
        }
    }
    System.out.println("The sum is: ");
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            System.out.println(c[i][j] + " ");
        }
     System.out.println();
    }
    

    }
}
