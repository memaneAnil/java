import java.io.*;
import java.util.*;

class Program410
{
    public static void main(String ar[])
    {
        Scanner sobj=new Scanner(System.in);

        try
        {
            System.out.println("Enter folder name");

            String foldername=sobj.nextLine();

            File fobj =new File(foldername);

            if(fobj.exists())
            {
                File allfiles[]=fobj.listFiles();
                System.out.println("Number of files are : "+allfiles.length);

                for(int i=0;i<allfiles.length;i++)
                {
                    System.out.println("FileName : "+allfiles[i].getName()+"Size : "+allfiles[i].length());
                }
            }
            else
            {
                System.out.println("There is no such folder");
            }
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured : "+obj);
        }
    }

   
}