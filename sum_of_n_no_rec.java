public class sum_of_n_no_rec {
    public static void printSum(int i, int n, int sum){
        if(i==n){
         sum += i;
         System.out.println(sum);
         return;
        }
        sum += i;
        printSum(i+1, 5, sum);
        System.out.println(i);
    }
    public static void main(String args[]){

     printSum(1, 5, 0);
    }
}
