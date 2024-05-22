
 class Employee{
        int id;
        String name;
        public void printDetails(){
            System.out.println("my id is "+ id);
            System.out.println("and my name is "+ name);
        }
    }


public class clase {

   
    
    public static void main(String args[]){
        System.out.println("This is our custom class: ");
        Employee shubham = new Employee();
        Employee prashant = new Employee();


        shubham.id = 24;
        shubham.name = "Shubham";

        prashant.id =  26;
        prashant.name = "Prashant";
        // System.out.println(shubham.id);
        // System.out.println(shubham.name);

        shubham.printDetails();
        prashant.printDetails();
    }
}
