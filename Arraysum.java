import java.util.*;
public class Arraysum 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n[]= new int[10];
        int sum=0;
        
        System.out.println("Enter 10 numbers");
        
        for(int i=0;i<=n.length;i++)
        {
            n[i]=sc.nextInt();
            sum+=n[i];
        }
        System.out.println("Sum of all elements="+sum);
        
    }
}
