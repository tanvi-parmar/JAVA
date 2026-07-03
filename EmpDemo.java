class Emp
{
    int id;
    String name;
    void getemp(int n,String nm)
    {
        id=n;
        name=nm;
        
    }
    void putemp()
    {
        System.out.println("Id= "+id);
        System.out.println("Name= "+name);
    }
}
public class EmpDemo 
{
    public static void main(String args[])
    {        
    Emp e1=new Emp();
    Emp e2=new Emp();
    e1.getemp(1,"Tanvi"); 
    e2.getemp(2,"Arshima");
    e1.putemp();
    System.out.println("-----------------");
    e2.putemp();
    }
}
