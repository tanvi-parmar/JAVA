class Employee
{
    int age;
    String name;
    float salary;
    
}
public class Emp6 
{
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.age=20;
        e.name="Tanvi";
        e.salary=20000.00f;
        System.out.println("Age : "+e.age);
        System.out.println("Name : "+e.name);
        System.out.println("Salary : "+e.salary);
    }
}
