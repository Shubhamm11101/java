// public class arguments {
//            static int sum(int ...arr){
//             int result=0;
//             for(int a: arr){
//                 result += a;
//             }
//             return result;
//            }
//  public static void  main(String args[]){
//     System.out.println("The sum of nothing is: " + sum());
//     System.out.println("The sum of 5, 6, and 7 is: " + sum( 5,6,7));
//     System.out.println("The usm of thr 6,7,8 and 9 is: " + sum(6,7,8,9) );

//     }

// }
public class patterns {
    static void patter01(int n){
     //row
     for(int i=1; i<=n; i++){
         //column
         for(int j=1; j<=i; j++){
             System.out.print("* ");
         }
         System.out.println();
     }
     
    }
    public static void main(String args[]){
     patter01(7);
      
    } 
 }