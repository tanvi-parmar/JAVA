import java.io.*;
public class CopyFile 
{
    public static void main(String args[])
    {
        try
        {
            FileReader fr=new FileReader("data.txt");
            FileWriter fw=new FileWriter("new.txt");
            int i;
            while((i=fr.read())!=-1)
            {
                fw.write(i);
            }
            fr.close();
            fw.close();
            System.out.println("File Copied..!");
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
    }
}