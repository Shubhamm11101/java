// abstract class Pen{
//     abstract void write();
//     abstract void refill();
// }
// class FountainPen extends Pen{
//     void write(){
//         System.out.println("Write from pen");
//     }
//     void refill(){
//         System.out.println("Refill the pen");
//     }
//     void changeNib(){
//         System.out.println("Change the nib");
//     }
// }
class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}
interface BasicAnimal {
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir");
    }
    void Name(){
        System.out.println("Shubham");
    }
    public void eat(){
    System.out.println("eating");

    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}


public class abstract_pr {
    public static void main(String args[]){
    //  Q1
    // FountainPen pen = new FountainPen();
    // pen.write();
    // pen.changeNib();
    // pen.refill();

    //Q2
    Human h = new Human();
    h.eat();
    h.sleep();
    h.Name();


    }
}
