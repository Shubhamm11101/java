interface Bicycle{
    int a = 35;
    void applyBreak(int decreament);
    void speedUp(int increament);
}

  interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
  }
  
class Avoncycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("po po popo po po po");
    }
  public void applyBreak(int decreament){
    System.out.println("Applying break");
  }
  public void speedUp(int increament){
    System.out.println("Increase the speed");
  }
  public void blowHornk3g(){
    System.out.println("pe pe pe pe po");
  }

  public void blowHornmhn(){
    System.out.println("pee po pee pee po");
  }
}




public class interface01 {
    public static void main(String args[]){
    Avoncycle h = new Avoncycle();
    h.blowHorn();
    h.speedUp(2);
    h.blowHornk3g();

  }
}
