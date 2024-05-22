abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor");

    }
    public void sayHello(){
        System.out.println("hello");

    }
    abstract public void greet();+
    abstract public void greet2();
  
}

class Child2 extends Parent2{
    public void greet(){
    System.out.println("Good morning");
    }
    public void greet2(){
    System.out.println("namesty");
    }
    
}

 abstract class Child3 extends Parent2{
  public void name(){
  System.out.println("Shubham");
  }
} 


public class Abstract_class {
    public static void main(String args[]){
    //Parent2 p = new Parent2();
    Child2 c = new Child2();
   // Child3 d = new Child3();    
}
}
