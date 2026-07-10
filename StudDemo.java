import java.util.*;
class Student
{
    String name;
    int age;
    char gender;
    Student()
    {
        name="Unknown";
        age=0;
        gender='F';        
    }
    Student(String nm,int ag,char gn)
    {
        name = nm;
        age = ag;
        gender = gn;
    }
    void show()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
        System.out.println();
    }
}
public class StudDemo 
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student("Tanvi",19,'F');
        System.out.println("Student-1 Details");
        s1.show();
        System.out.println("Student-2 Details");
        s2.show();
        
    }
}
