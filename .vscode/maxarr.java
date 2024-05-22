

public class maxarr {
    public static void main(String args[])
  {  
    int arr [] = {23,45,43,56,78,65};
    int max = Integer.MIN_VALUE;
    for(int e: arr){
        if(e>max){
            max = e;
        }
    }
      System.out.println("The value of the maximum element in this array : " +max);
} 
}
