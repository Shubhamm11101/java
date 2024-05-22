public class simple {
    simple(){
        this(10);                                                                   
        System.out.println("hello world");
    }
   
    simple(int a){
        this(10,20);
        System.out.println(a);
    }
    simple(int a,int b){
        
        System.out.println(a+b);
    }
    public static void main(String args[]){

    simple s = new simple();
     }
}