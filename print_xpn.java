public class print_xpn {
    static int calcPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1 = calcPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String args[]){
       int x = 3, n= 6;
       int result = calcPower(x, n);
       System.out.println("The result is: "+ result);
    }
}
