import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
class Program421
{
    public static void main(String ar[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the string");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");

        for(int i=0;i<Arr.length;i++)
        {
            System.out.println("Name : "+Arr[i]+" length : "+Arr[i].length());
        }

        System.out.println("Number of words are : "+ Arr.length);
    }

   
}