import java.util.Scanner;

public class transpose_matrix {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the base of matrix");
    n = sc.nextInt();
    
    int a[][] = new int[n][n];
    int t[][] = new int [0][0];

    System.out.println("Enter the element of matrix");
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            a[i][j] = sc.nextInt();
           
        }
    }
    
    // System.out.println("The before transpose: ");
    // for(int i=0;i<n; i++){
     
        
    //     for(int j=0; j<n; j++){
            
    //         System.out.println(a[i][j] + " ");
           
    //     }
    //     System.out.println(" ");
    
      System.out.println("The after transpose : ");
      for(int j=0; j<n;j++)
      {
        for (int i=0;i<n; i++){
        System.out.print(a[i][j] + " ");
        }
        System.out.println(" ");
      }
    }
    
}
