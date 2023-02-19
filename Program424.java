import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
class Program424
{
    public static void main(String ar[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the string");

        String str = sobj.nextLine();

        System.out.println("Enter the word you want to search");

        String word = sobj.nextLine();

        String Arr[] = str.split(" ");

        int iCount=0;

        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i].equals(word))
            {
                iCount++;
            }
           
        }

        System.out.println("Frequency of word is : "+iCount);
    }

   
}