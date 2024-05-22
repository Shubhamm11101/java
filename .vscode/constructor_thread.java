class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
    }
}


public class constructor_thread {
    public static void main(String args[]){
     MyThr t1 = new MyThr("Shubham");
     MyThr t2 = new MyThr("Lala");
     t1.start();
     t2.start();
     System.out.println("The id of the thread t is "+ t1.getId());
     System.out.println("The Name of the thread t is "+ t1.getName());
     System.out.println("The id of the thread t is "+ t2.getId());
     System.out.println("The Name of the thread t is "+ t2.getName());


    }
}
