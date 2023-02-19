import java.io.*;
import java.util.*;

class Program409
{
    public static void main(String ar[])
    {
         Scanner sobj=new Scanner(System.in);

        try
        {
            System.out.println("Enter the source file name : ");
            String source=sobj.nextLine();

            System.out.println("Enter the destination file name : ");
            String dest=sobj.nextLine();

            File fsource=new File(source);
            File fdest=new File(dest);

            boolean bret=fsource.exists();

            if(bret==false)
            {
                System.out.println("Source file is not existing... ");
                return;
            }

            bret=fdest.createNewFile();
            
            if(bret==false)
            {
                System.out.println("Unable to create destination file...");
            }
            
            FileInputStream fiobj=new FileInputStream(fsource);
            FileOutputStream foobj=new FileOutputStream(fdest);

            byte Buffer[]=new byte[1024];

            int ret=0;
            while((ret=fiobj.read(Buffer)) !=-1)
            {
                foobj.write(Buffer);
            }
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured : "+obj);
        }
    }

   
}