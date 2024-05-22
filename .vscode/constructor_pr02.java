class rectangle{
    private int length;
    private int breadth;
    
    public rectangle(){
         length = 4;
         breadth = 5;
    }

    public rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
    public int parameter(){
        return 2*(length+breadth);
    }
}


public class constructor_pr02 {
    public static void main(String args[]){
    rectangle r = new rectangle(9,8);
    // System.out.println(r.getLength());
    // System.out.println(r.getbreadth());
    System.out.println(r.parameter());
    }
}
