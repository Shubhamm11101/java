class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void callFriend(){
        System.out.println("Call friend");
    }
    public void vibrate(){
        System.out.println("Vibrate phone");
    }
}


public class structurecl {

    public static void main(String args[]){
    cellPhone asus = new cellPhone();
    asus.ring();
    asus.callFriend();
    asus.vibrate();

    }
}
