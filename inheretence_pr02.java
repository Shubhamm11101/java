class Rectangle{
    public int length;
    public int breadth;

    Rectangle(){
        System.out.println("I am rectangle");
    }
    Rectangle(int l, int b){
        System.out.println("I am rectangle of constructor 2");
        this.length = l;
        this.breadth = b;

    }

    public int area(){
        return this.length*this.breadth;

    }
}
  class Cuboid extends Rectangle{
    public int height;

    Cuboid(){
        System.out.println("I am a cuboid");

    }
    Cuboid(int l, int b, int h){
        super(l,b);
        System.out.println("I am cuboid of class 2");
        this.height = h;
    }

    public int area(){
        return this.length*this.breadth*this.height;
    }
  }


public class inheretence_pr02 {
    public static void main(String args[]){
        Rectangle r = new Rectangle(7,8);
        Cuboid c = new Cuboid(4,5,6);
        
    }
}
