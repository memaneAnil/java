import java.util.Scanner;
import java.io.*;
class Program405
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
            BufferedReader bobj=new BufferedReader(new FileReader(fobj));

            String data;

            while((data=bobj.readLine()) != null)
            {
                System.out.println(data);
            }
        }
        else
        {
            System.out.println("There is no such file");
        }
       
    }
}