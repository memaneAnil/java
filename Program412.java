import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
class Program412
{
    public static void main(String ar[])
    {
        Scanner sobj=new Scanner(System.in);

        try
        {
            System.out.println("Enter folder name");

            String foldername=sobj.nextLine();

            System.out.println("Enter the pack file name");

            String packfile=sobj.nextLine();

            File fpackobj=new File(packfile);

            fpackobj.createNewFile();

            FileOutputStream fout=new FileOutputStream(fpackobj);



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
                        fout.write(Buffer,0,ret);
                        
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