class Value
{
    int a;
    void getvalue()
    {
             a=10;
    }
    void putvalue()
    {
        System.out.println("a= "+a);
    }
}
public class ValDemo 
{
    public static void main(String args[])
    {
        Value v1=new Value();
        v1.getvalue();
        v1.putvalue();
    }
}
