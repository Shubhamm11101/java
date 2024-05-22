interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Record in 4K video");
    }
}
interface MyWifi{
    String[] getNetwork();
    void connectToNetworks(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap ");
    }
    public String[] getNetwork(){
        System.out.println("Getting list pf networks");
        String[] networkList = {"Harry ","Shubham", "Manikant","Ujjawal"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
   
}
    @Override
    public void recordVideo() {
        
        System.out.println("Record video");
    }
    @Override
    public void connectToNetworks(String network) {
    
        throw new UnsupportedOperationException("Unimplemented method 'connectToNetworks'");
    }
}


public class polymorphism_interface {
    
    public static void main(String args[]){

      MyCamera cam = new MySmartPhone();
      cam.record4KVideo();

      MySmartPhone p = new MySmartPhone();
      p.takeSnap();
      p.recordVideo();
      p.getNetwork();

    }
}
