class E extends Thread 
{
    public void run()
    {
        for(int i=1 ; i<=5 ; i++)
        {
            System.out.println("From E..i=" +i);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class SleepDemo 
{
     public static void main(String[] args) 
    {
        E e1 = new E();
        e1.start();
    }
}
