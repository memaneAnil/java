import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
class Program423
{
    public static void main(String ar[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the string");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");

        int iCount=0;

        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i].equals("Demo"))
            {
                iCount++;
            }
           
        }

        System.out.println("Frequency of demo word is : "+iCount);
    }

   
}