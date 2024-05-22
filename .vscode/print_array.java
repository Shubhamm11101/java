import java.util.Scanner;

public class print_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("The array is : ");
        for(int i=0; i<numbers.length; i++)
        {
        numbers[i] = sc.nextInt();
        }
        
    }
}
