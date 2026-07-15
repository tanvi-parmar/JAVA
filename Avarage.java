import java.util.*;
public class Avarage 
{
     public static void main(String args[])
    {
        int a,b,c;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a=sc.nextInt();
        System.out.print("Enter B: ");
        b=sc.nextInt();
        System.out.print("Enter C: ");
        c=sc.nextInt();
        avg=(a+b+c)/3;
        System.out.println("Avarage = "+avg);
                
    }
}
