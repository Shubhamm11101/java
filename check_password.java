import java.util.Scanner;


    public static int main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String");
      String str = sc.nextLine();
      System.out.println(str);

      if(str.length()<=4){
         return 0;
      }
       for(int i = 0; i<str.length(); i++){
        if(str.charAt[i]>=0 || str.charAt[i]<=9){
            return 1;
        }
       }
      
    //   for(int i = 0; i<str.length(); i++){
    //     System.out.println(str);
    //   }





    } 

