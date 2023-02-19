import java.util.*;

class Program485
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String newStr = str.trim();
        String Arr[]=newStr.split(" ");
        
        System.out.println("Number of words are : "+Arr.length);
    }
}

