import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
class Program422
{
    public static void main(String ar[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the string");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");

        int Max=0,index=0,i=0;

        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i].length()>Max)
            {
                Max = Arr[i].length();
                index = i;
            }
           
        }

        System.out.println("Largest word is : "+ Arr[index]+ " with the length : "+Max);
    }

   
}