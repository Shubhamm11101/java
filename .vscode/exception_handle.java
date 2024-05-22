import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
      return "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Age cannot begreater than 126";
    }
    @Override
    public String getMessage(){
       return "Make sure that value of age entered is correct";
    }
}

public class exception_handle {
    public static void main(String args[]){
      int a;
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      if (a<9){
       try{
        throw new ArithmeticException("This is exception ");
       } catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
        System.out.println("Finished");
       }
       System.out.println("Yes Finished");
      }
      System.out.println("This is good5n");
    }
}
