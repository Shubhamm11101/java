class Student{
    int rollno;
    static String Subject;
    void get(){
        System.out.println("rollno is "+ rollno);
        System.out.println("Subject is "+Subject);
    }
}


public class next {
     
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        Student.Subject = "core java";
        s1.rollno = 10;
        s1.Subject = "Adavnce java";
        s2.rollno = 20;
        s1.rollno = 79;
        s1.get();
        s2.get();


    }
}
