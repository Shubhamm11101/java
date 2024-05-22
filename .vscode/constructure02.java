class MyEmployee01{

private int salary;
private String name;


public MyEmployee01(){
    name = "Shubham Bhardwaj";
    salary = 100000;
}

public MyEmployee01(String myName, int mySalary){
   name = myName;
   salary = mySalary;
}
public String getName(){
    return name;
}

public void setname(String n){
  name = n;
}
public int getsalary(){
    return salary;
}
public void setsalary(int s){
    salary = s;
}

}

public class constructure02 {
    public static void main(String args[]){
        MyEmployee01 shubham = new MyEmployee01("Shubham Bhardwaj",10000);
        System.out.println(shubham.getsalary());
        System.out.println(shubham.getName());
    }
}
