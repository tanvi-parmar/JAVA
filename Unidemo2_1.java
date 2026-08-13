import java.util.*;
class University
{
    String uname,ucity;
    int tot_stud;
    
    void getUni()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter University Name:");
        uname=sc.next();
        System.out.print("Enter University City:");
        ucity=sc.next();
        System.out.print("Enter Total Student:");
        tot_stud=sc.nextInt();
    }
}
class Department extends University
{
    int deptno;
    String deptname;
    
    void getDept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Department no.:");
        deptno=sc.nextInt();
        System.out.print("Enter Department name:");
        deptname=sc.next();
    }
    void display()
    {
        System.out.println("University Name:"+uname);
        System.out.println("University City:"+ucity);
        System.out.println("Total Student:"+tot_stud);
        System.out.println("Department no.:"+deptno);
        System.out.println("Department name:"+deptname);
    }
}
public class Unidemo2_1 
{
    public static void main(String args[])
    {
        Department d1 =new Department();
        Department d2 =new Department();
        System.out.println("Enter details for Object 1");
        d1.getUni();
        d1.getDept();

        System.out.println("\nEnter details for Object 2");
        d2.getUni();
        d2.getDept();

        System.out.println("\nDetails of Object 1");
        d1.display();

        System.out.println("\nDetails of Object 2");
        d2.display();
    }
}
