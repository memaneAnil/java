import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
class Program411
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

                int ret=0;
                byte Buffer[]=new byte[1024];

                for(int i=0;i<allfiles.length;i++)
                {
                    System.out.println("FileName : "+allfiles[i].getName()+"Size : "+allfiles[i].length());

                    FileInputStream fiobj=new FileInputStream(allfiles[i]);

                    while((ret=fiobj.read(Buffer))!=-1)
                    {
                        String str = new String(Buffer, StandardCharsets.UTF_8);
                        
                        System.out.println(str);
                        
                    }

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