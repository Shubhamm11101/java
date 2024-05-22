class Employee{
        int salary;
        String name;

        public int getSalary(){
            return salary;
        }

        public String getName(){
            return name;
        }
        public void setName(String n){
            name = n;
        }


public class employee_pr_01 {
    
    }
    public static void main(String args[]){

    Employee shubham = new Employee();
    shubham.setName("Shubham did great");
    shubham.salary = 525;
    System.out.println(shubham.getSalary());
    System.out.println(shubham.getName());
    }
}
