import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
class Program425
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

                String Arr[] = strHeader.split(" ");

                System.out.println("Name of the file is :"+Arr[0]);
                System.out.println("File size is : "+  Arr[1]);

                File obj = new File(Arr[0]);

                obj.createNewFile();
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