
class Company
{
    int Ccode;
    String Cname;
    
    void getCmp(int code,String name)
    {
        Ccode=code;
        Cname=name;
    }
}
class Emp1 extends Company
{
    int id;
    String name;
    float salary;
    
    void getEmp(int i,String n,float sal)
    {
        id=i;
        name=n;
        salary=sal;        
    }
    void show()
    {
        System.out.println();
        System.out.println("---Detailes of Company---");
        System.out.println("Company code: "+Ccode);
        System.out.println("Company name: "+Cname);
        System.out.println("Employee id: "+id);
        System.out.println("EMployee name: "+name);
        System.out.println("Employee salary: "+salary);
    }
}
        
public class CompDemo 
{
    public static void main(String args[])
            {
                Emp1 e1= new Emp1();
                Emp1 e2= new Emp1();
                
                e1.getCmp(201,"TCS");
                e2.getCmp(202,"Relience");
                
                e1.getEmp(01,"Tanvi",50000);
                e2.getEmp(02,"Arshima",60000);
                
                e1.show();
                e2.show();
            }
}
