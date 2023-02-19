import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
class Program417
{
    public static void main(String ar[])
    {
        Scanner sobj=new Scanner(System.in);

        try
        {
            
            System.out.println("Enter the name of packed file : \n");
            System.out.println("Enter the name of packed file : \n");

            String packfile=sobj.nextLine();

            File fpackobj=new File(packfile);

            FileInputStream fin=new FileInputStream(fpackobj);

            if(fpackobj.exists())
            {
                System.out.println("Packed file is there : \n");
            }
            else
            {
                System.out.println("There is no such file : \n");
            }
            //File fobj =new File(foldername);
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured : "+obj);
        }
    }

   
}