interface Car{
   void speed(int increament);
   void avrage(int average);
}

interface Truck{
    void load();
    void TimeTaking();
}

class Suv implements Car, Truck{
    void largeSuv(){
        System.out.println("The monster suv:");
    }
     public void speed(int increamnet){
        System.out.println("The speed of the car on NH is"+ increamnet);
     }

    @Override
    public void load() {
       System.out.println("The load is more: ");
    }

    @Override
    public void TimeTaking() {
        System.out.println("Time takes to reach the destination");
    }

    @Override
    public void avrage(int average) {
        System.out.println("The average of the car is "+ average);
    }
}


public class intrf {
    public static void main(String args[]){
    Suv s = new Suv();
    s.speed(120);
    s.avrage(23);
    s.load();
    s.TimeTaking();
    s.largeSuv();

    }
}
