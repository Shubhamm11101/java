class Cylinder01{
    private int radius;
    private int height;

    public Cylinder01(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*height;
    }
}


public class contructer_pr01 {
   public static void main(String args[]){
   Cylinder01 myCylinder01 = new Cylinder01(9, 12);
   System.out.println(myCylinder01.getheight());
   System.out.println(myCylinder01.getRadius());
   System.out.println(myCylinder01.surfaceArea());
   System.out.println(myCylinder01.volume());
   } 
}
