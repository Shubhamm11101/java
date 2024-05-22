import java.util.Scanner;

public class vowels {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        if((ch=='a') || (ch=='i') || (ch=='o') || (ch=='e') || (ch=='u') || (ch == 'A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U'))
        {
            System.out.println("This is vowel");
        }
        else
        {
            System.out.println("This is not the vowel");
        }

    }
}
