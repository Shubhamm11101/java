class Animal{
   public String Name;

    public String getname(){
     return Name;
    }

    public void setName(String n){
    System.out.println("The name is Jack");
    this.Name = n;
    }
}

class Dog extends Animal{
    public String bark;
    
    public String getbark(){
        return bark;
    }

    public void setbark(String b){
        this.bark = b;
    }

}



public class Inheritence_animal { 
    public static void main(String args[]){
    Animal a = new Animal();
    a.setName("jack");
    System.out.println(a.getname());


    Dog d = new Dog();
    d.setbark("bhobho");
    System.out.println(d.getbark());

    }
}

