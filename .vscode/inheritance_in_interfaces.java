interface simpleInterface{
    void meth1();
    void meth2();
}
interface childSimpleInterface extends simpleInterface{
    void meth3();
    void meth4();
}
class MySimpleInterface implements childSimpleInterface{
    public void meth1(){
        System.out.println("This is meth1");
    }
    public void meth2(){
        System.out.println("This is meth 2");
    }
    public void meth3(){
        System.out.println("This is meth3");
    }
    public void meth4(){
        System.out.println("This is meth4");
    }
}


 
public class inheritance_in_interfaces {
    public static void main(String args[]){
     MySimpleInterface m = new MySimpleInterface();
     m.meth1();
     m.meth2();
     m.meth3();
     m.meth4();

    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    