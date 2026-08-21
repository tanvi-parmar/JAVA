abstract class shape
{
    abstract void draw();
}
class Circle extends shape
{
    void draw()
    {
        System.out.println("Draw Circle");
    }
}
class rectangle extends shape
{
    void draw()
    {
       System.out.println("Draw Rectangle"); 
    }      
}
public class AbsDemo 
{
    public static void main(String args[])
    {
        shape s;
        Circle c1=new Circle();
        rectangle r1= new rectangle();
        s=r1;
        s.draw();
    }
}
