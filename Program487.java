import java.util.*;

class Program487
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String data = str.replaceAll("\\s+"," ");
        System.out.println(data);
        String newStr =data.trim();
        String Arr[]=newStr.split(" ");
        
        System.out.println("Number of words are : "+Arr.length);
    }
}

