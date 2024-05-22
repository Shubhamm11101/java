class Phone{
    public void showTime(){
     System.out.println("The show time is 8 pm ");
    }
    public void on(){
     System.out.println("Switch on the phone ");
    }
 
 
 }
 class SmartPhone extends Phone{
   public void music(){
     System.out.println("Start the music");
   }
   public void on(){
     System.out.println("Switch on the smart pohone");
   }
 }
 
 
 
 public class polymorphism {
 
     public static void main(String args[]){
     Phone p = new SmartPhone();
     p.showTime();
     p.on();
 
 
     }
 
    
 }
 