import java.util.Scanner;

public class deletion_of_array {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elelements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element you want to delete: ");
        int elem = sc.nextInt();

        for(int i=0; i<arr.length; i++){
        if(arr[i] == elem)
        {
        for(int j=i; j<arr.length-1; j++)
        {
        arr[j] = arr[j+1];
        }
        break;
        }
        }
        System.out.println("Elements after deletion of array: ");
        for(int i=0; i<arr.length-1; i++){
        System.out.print(arr[i] + " ");
        }
    }
}
