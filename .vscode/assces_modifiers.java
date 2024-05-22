class MyEmployee{
    private int id;
    private String name;

    public String getName(){
    return name;

    }

    public void setName(String n){
    name = n;
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}


public class assces_modifiers {
    public static void main(String args[]){
        MyEmployee e = new MyEmployee();
        e.setName("Shubham");
        System.out.println(e.getName());
        e.setId(24);
        System.out.println(e.getId());
    }
}
