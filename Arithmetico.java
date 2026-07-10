import java.util.*;
public class Arithmetico 
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a=sc.nextInt();
        System.out.print("Enter B: ");
        b=sc.nextInt();
        
        System.out.println("A + B = "+(a+b));
        System.out.println("A - B = "+(a-b));
        System.out.println("A * B = "+(a*b));
        System.out.println("A / B = "+(a/b));
    }
}
