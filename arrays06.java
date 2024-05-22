// import java.util.Scanner;

// public class divisibility {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         System.out.println(a);


//         if((a%5==0)  && (a%11==0)) {
//           System.out.println("A is divisible by 5 and 11");
//         } else{
//           System.out.println("A is not divisible by 5 and 11");
//         }

//     }

// }

import java.util.*;

//Compiler version JDK 11.0.2

 public class arrays06
{  
  public static void main(String args[])
  {  
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int numbers[]= new int [size];
     
      for(int i=0; i<size; i++){
      numbers[i] = sc.nextInt();
      }
      
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      
      for(int i=0; i<numbers.length; i++){
          
      if(numbers[i] < min){
      min = numbers[i];
      }
      if(numbers[i] > max){
      max = numbers[i];
      }
    }
  }
}