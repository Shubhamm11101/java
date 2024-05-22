class MyThreadRunnable implements Runnable{
public void run(){
System.out.println("I am thread1 not a threat1");
}
}
class MyThreadRunnable2 implements Runnable{
public void run(){
System.out.println("I am thread2 not a threat2");

}
}


public class MyThread2 {
public static void main(String args[]) {
MyThreadRunnable r1 = new MyThreadRunnable();
Thread t1 = new Thread(r1);

MyThreadRunnable2 r2 = new MyThreadRunnable2();
Thread t2 = new Thread(r2);

t1.start();
t2.start(); 

  }
}
