class MyMainEmployee{
    private int id;
    private String name;
    
    public MyMainEmployee(){
        id = 24;
        name = "Shubham Bhardwaj";
    }

    public MyMainEmployee(String myName, int myId){
        name = myName;
        id = myId;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
        
    }
    public void setId(int n){
        id = n;
    }
    public int getId(){
        return id;
    }
}


public class constructures {
    public static void main(String args[]){

    MyMainEmployee shubham = new MyMainEmployee("Shubham Bhardwaj",24);

    System.out.println(shubham.getId());
    System.out.println(shubham.getName());
    }
}
