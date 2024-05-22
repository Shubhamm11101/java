public class factorial {
    public static void main(String args[]){
        int n = 5;
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial = n*i;
            i++;
        }
        System.out.println(factorial);
    }
}
