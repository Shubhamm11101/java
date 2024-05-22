abstract class  Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
 
class SmartTelephone extends Telephone{
    void ShowName(){
        System.out.println("Call form Mummy");
    }
    void ShowCharging(){
        System.out.println("On Charging");
    }
    public void ring(){
        System.out.println("Ringing");
    }
    public void lift(){
        System.out.println("Lift the phone");
    }
    public void disconnect(){
        System.out.println("disconnect the phone");
    }
}


public class abstract_pr02 {
    public static void main(String args[]){
    Telephone s = new SmartTelephone();
    s.ring();
    s.disconnect();
    s.lift();
    

    }
}
