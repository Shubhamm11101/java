class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}
class circle{
    int r;
    float pi = 3.14f;
    public float area(){
        return pi*r*r;
    }
}

public class structure_square {
public static void main(String args[]){

Square sq = new Square();
sq.side = 3;
System.out.println("The area of square: ");
System.out.println(sq.area());
System.out.println("The perimeter of square: ");
System.out.println(sq.perimeter());
    

rectangle r = new rectangle();
r.l= 4;
r.b= 5;
System.out.println("Area of rectangle");
System.out.println(r.area());
System.out.println("Perimeter of rectangle");
System.out.println(r.perimeter());


circle c = new circle();
c.r = 3;
System.out.println("The area of circle: ");
System.out.println(c.area());


}

}