import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
class Program418
{
    public static void main(String ar[])
    {
        Scanner sobj=new Scanner(System.in);

        try
        {
            
            System.out.println("Enter the name of packed file : ");
            
            String packfile=sobj.nextLine();

            File fpackobj=new File(packfile);

            FileInputStream fin=new FileInputStream(fpackobj);

            if(fpackobj.exists())
            {
                System.out.println("Packed file is there : ");

                byte Header[] = new byte[100];

                fin.read(Header,0,100);

                String strHeader = new String(Header);

                System.out.println(strHeader);
            }
            else
            {
                System.out.println("There is no such file : ");
            }
            //File fobj =new File(foldername);
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured : "+obj);
        }
    }

   
}