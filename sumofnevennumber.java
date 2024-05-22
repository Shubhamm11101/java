public class sumofnevennumber {
    // public static void main(String args[]){
    //     int sum = 0;
    //     int n = 4;
    //     for(int i = 0; i<n; i++){
    //         sum = sum+(2*i);
    //     }
    //     System.out.println("Sum of even numer is : ");
    //     System.out.println(sum);
    
    
        public static void main(String args[])
        {  
            
            int [][] flats;
            flats = new int [2][3];
            flats[0][0] = 101;
            flats[0][1] = 102;
            flats[0][2] = 103;
            flats[1][0] = 201;
            flats[1][2] = 202;
            flats[1][3] = 203;
            
           for(int i= 0; i<flats.length; i++){
               for(int j = 0; j<flats[i].length; j++){
               System.out.print(flats[i][j]);
               System.out.print(" ");
               }
              System.out.println("");
           }
        }
      }
