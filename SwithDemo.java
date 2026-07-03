import java.util.*;
public class SwithDemo 
{
    public static void main(String args[])
    {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value1 : ");
        a=sc.nextInt();
        System.out.print("Enter Value2 : ");
        b=sc.nextInt();
        System.out.println("\t1.Add");
        System.out.println("\t2.Sub");
        System.out.println("\t3.Mul");
        System.out.println("\t4.Div");
        System.out.print("Enter your choice : ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("sum= "+(a+b));
                break;
            case 2:
                System.out.println("Sub= "+(a-b));
                break;
            case 3:
                System.out.println("Mul= "+(a*b));
                break;
            case 4:
                System.out.println("Div= "+(a/b));
                break;
            default:
                System.out.println("Invalid number ");
            
        }
       
        
    }
}
