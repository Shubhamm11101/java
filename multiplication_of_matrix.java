import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;

public class multiplication_of_matrix {
   public static void main(String args[]){
    int n;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the base of square matrix: ");
     n = sc.nextInt();
     int [][] a= new int[n][n];
     int [][] b= new int [n][n];
     int [][] c = new int[n][n];
     System.out.println("Enter the elements of 1st matrix: ");
     for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            a[i][j] = sc.nextInt();

        }
     }
     System.out.println("Enter the elements of second matrix: ");
     for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            b[i][j] = sc.nextInt();
        }
     }
    System.out.println("Multiplying the matrix: ");
    for(int i=0; i<n; i++)
    {
        {
            for(int j=0; j<n; j++)
        
        for(int k=0; k<n; k++)
        {
            c[i][j] += a[i][k] * b[k][j]; 
        }
    }
}
     System.out.println("The product is: ");
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++){
            System.out.print(c[i][j]+ " ");
        }
        System.out.println();
    }
    
    }

   } 

