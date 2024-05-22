class MyThread1 extends Thread{
    public void run(){
        int i =0;
        while(i<4000){
            System.out.println("My Cooking is Thread is Running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("My Thread is coming");
            System.out.println("I am sad");
            i++;
        }
    }
}


public class MyThrd {
   public static void main(String args[]){
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();
    }
}
