class Phone{
    public void showTime(){
        System.out.println("Timing is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone....");
    }
}

class smartPhone extends Phone{
    public void music(){
        System.out.println("Turning on music");
    }
    public void on(){
        System.out.println("Turning on smart phone");
    }
}


public class dynamic_method {
    public static void main(String args[]){
     Phone obj = new smartPhone();
     obj.on();
     obj.showTime();
    
    }
}
