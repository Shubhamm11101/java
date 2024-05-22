abstract class Phone{
abstract void on();
}
 class SmartPhone extends Phone{
    void on(){
        System.out.println("Turning on... ");
    }

}
public class abstract_class02 {
        public static void main(String args[]){
      Phone p = new SmartPhone();    
    p.on();
    }
}
