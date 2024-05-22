public class recursion_fac {
    public static int fac(int n){
    if((n==0) || (n==1)){
    return 1;
    }
    else{
    return (n) * fac(n-1);
    }
    }
    public static void main(String args[]){
    int x=129;
    System.out.println(fac(x));  
     
    }
}
