    class tttThread1 extends Thread{
    @Override
    public void run(){
        int i =0; 
        while(i<2000){
            System.out.println("My thread is running and currently RR in top:");
            System.out.println("My thread is working: ");
            i++;
        }
    }
}

class tttThread2 extends Thread{
    
    public void run(){
        int i=0;
        while(i<2000){
            System.out.println("I am currently coding and watching match ");
            System.out.println("The RCB is Struggling");
            i++;
        }
    }
}
 public void slow(){
    int i=0; 
    while(i<2000){
    System.out.println("I am happy");
    System.out.println("I am sad");
    i++;
    }
 }


public class multi_threading {
  public static void main(String  args[]){
  tttThread1 t1 = new tttThread1();
  tttThread2 t2 = new tttThread2();
  t1.start();
  t2.start();
 

  }  
}
