class MyThr1 extends Thread{
    public void run(){
        int i =0;
        while(true){
            System.out.println("Thank you: ");
            try{
                Thread.sleep(34);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyThr2 extends Thread{
    public void run(){
        while(true){
            System.out.println("My Thank you: ");
        }
    }
}


public class thread_methods {
     public static void main(String args[]){
      MyThr1 t1 = new MyThr1();
      MyThr2 t2 = new MyThr2();
      t1.start();
      t2.start();
     }

}
