class Rect
{
    float len;
    float wid;
    void getdata(float l,float w)
    {
        len=l;
        wid=w; 
    }
    float area()
    {
        return(len*wid);
    }
}
public class RectDemo 
{
    public static void main(String args[])
    {
        Rect r1=new Rect();
        r1.getdata(10.0f, 5.0f);
        System.out.println("Area of Rectangle= "+r1.area());
    }
}
