public class patternfunctions {
    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern1(4);
    }
}
