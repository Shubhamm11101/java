class C1{
    public int x = 4;
    protected int n = 5;
    int z = 7;
    private int a = 8;
    public void meth1(){
    System.out.println(x);
    }

}
public class ascess_mod {
    public static void main(String args[]){
    C1 c = new C1();
    c.meth1();
        
 }
}
