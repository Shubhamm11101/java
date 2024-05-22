import java.util.*;

public class remove_duplicate02 {
   
    public static int[] main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int nums[]= new int [size];
    int n = nums.length;

    int [] ans = new int[n];

    int posIndex = 0;
    int negIndex =1;

    for(int i=0; i<n; i++){
    if(nums[i]>0){
        ans[posIndex] = nums[i];
        posIndex += 2;
    }
    else{
        ans[negIndex] += 2;
        negIndex += 2;
    }
    } 
    return ans;


    }
}
