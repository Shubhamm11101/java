public class tower_of_hanoi {
    static void toHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk "+ n +" from "+ src +" to "+ dest );
            return;
        }
        toHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk"+ n+ " from "+ src+" to "+ dest);
        toHanoi(n-1, helper,src, dest);
    }
    public static void main(String args[]){
     int n= 3;
     toHanoi(n, "S", "H", "D");
    }
}
