class Sphere{
    private int radius;
    public Sphere(int radius){
        this.radius = radius;
    }
    
    public int getradius(){
        return radius;
    }
    public void setradius(int radius){
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}


public class sphere_cons {
   public static void main(String args[]){
   Sphere s = new Sphere(8);
   System.out.println(s.surfaceArea());
   } 
}
