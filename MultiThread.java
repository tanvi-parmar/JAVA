class C extends Thread 
{
    public void run()
    {
        for(int i=1 ; i<=5 ; i++)
        {
            System.out.println("From C..i=" +i);
        }
    }
}

class D extends Thread 
{
    public void run()
    {
        for(int j=1 ; j<=5 ; j++)
        {
            System.out.println("From D..i=" +j);
        }
    }
}
public class MultiThread 
{
    public static void main(String args[])
    {
        C c1 = new C();
        D d1 = new D();
        c1.start();
        d1.start();
    }
}
