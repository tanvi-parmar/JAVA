import java.util.*;
public class InputValues 
{
    public static void main(String args[])
    {
        int a;
        float b;
        double c;
        String s1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Int value : ");
        a=sc.nextInt();
        System.out.print("Enter Float value : ");
        b=sc.nextFloat();
        System.out.print("Enter Double value : ");
        c=sc.nextDouble();
        System.out.print("Enter String value : ");
        s1=sc.next();
        
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
        System.out.println("value of c : "+c);
        System.out.println("value of s1 : "+s1);
    }
}
