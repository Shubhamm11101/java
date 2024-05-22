class Cylinder{
    private int height;
    private int radius;

    public Cylinder(){

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


    public class ascess_modiefiers_pr01 {
    public static void main(String ags[]){
    Cylinder myCylinder = new Cylinder();
    myCylinder.setheight(12);
    myCylinder.setRadius(9);
    int r = myCylinder.getRadius();
    int h = myCylinder.getheight();
    System.out.println(h);
    System.out.println(r);
    System.out.println(myCylinder.surfaceArea());
    System.out.println(myCylinder.volume());
    }
}
