import java.util.Scanner;
import java.io.*;
import java.nio.charset.StandardCharsets;  
class Program407
{
    public static void main(String a[]) throws Exception
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the name of file");

        String fname=sobj.nextLine();

        System.out.println("File name is : "+fname);

        File fobj=new File(fname);

        int size=0;

        if(fobj.exists())
        {
            FileInputStream bobj=new  FileInputStream(fobj);

            byte Buffer[]=new byte[100];

            int ret=0;

            while((ret=bobj.read(Buffer)) != -1)
            {
                size=size+ret;
                
            }
            System.out.println("Number of bytes are : "+size);
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}