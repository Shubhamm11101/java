import java.util.Scanner;

public class try_catch_block {
    public static void main(String args[]){
    // int a = 6000;
    // int b = 0;
    // try{
    //     int c = a/b;
    //     System.out.println("thr result is "+ c);
    // }
    // catch(Exception e){
    //     System.out.println("we fail to divide. Reason: ");
    //     System.out.println(e);
    // }

    // System.out.println("End of the program ");

    int [] marks = new int [3];
    marks[0] = 7;
    marks[1] = 28;
    marks[2] = 48;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array index: ");
    int ind = sc.nextInt();

    System.out.println("Enter the number you want to divide the value with: ");
    int number = sc.nextInt();

    try{
        System.out.println("The value at index entered is: " + marks[ind]);
        System.out.println("the value of the number is : "+  marks[ind]/number);
    }
    catch(ArithmeticException e){
        System.out.println("ArithmeticException is occured!");
        System.out.println(e);

    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutBoundsException Exception Occureded!");
        System.out.println(e);
    }
    catch(Exception e){
        System.out.println("Some Exception occured: ");
        System.out.println(e);
    }
    }
}
