class A{
    
public void meth2(){
    System.out.println("I am method of 2 of class A");
}   
}
class B extends A{
    
    public void meth2(){
        System.out.println("I am methd 2 of class B");
    }
    public void meth3(){
        System.out.println("I am a method 3 of class B");
    }
    
    
}



public class method_overriding {
    public static void main(String args[]){

     A a = new A();
     a.meth2();

     B b = new B();
     b.meth2();
    

    }
}
