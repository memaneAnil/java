import java.util.Scanner;
import java.io.*;
class Program403
{
    public static void main(String a[]) throws Exception
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the name of file");

        String fname=sobj.nextLine();

        System.out.println("File name is : "+fname);

        File fobj=new File(fname);

        if(fobj.exists())
        {
            System.out.println("File size is : "+fobj.length());
        }
        else
        {
            System.out.println("There is no such file");
        }

       
    }
}