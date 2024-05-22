public class recursion_fibbonacci {

    static int fib(int n){
        if(n==1){
            return 0;

        }
        else if(n==2){
            return 1;
        }
        else{
          return fib(n-1)+fib(n-2);
        }
    }
        public static void main(String args[]){

    
    
    for(int i=0; i<=fib(n); i++){
        System.out.println(fib(i));
    }
    }
}
