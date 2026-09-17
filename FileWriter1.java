import java.io.*;
public class FileWriter1 
{
    public static void main(String args[])
    {
        try
        {
            FileWriter fw=new FileWriter("data.txt");
            fw.write("Parmar Tanvi");
            fw.close();
            System.out.println("Data Write SUccessfully..");
        }
        catch(Exception e)
                {
                    System.out.println("e");
                }
    }
}
