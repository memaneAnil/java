import java.util.*;

class Program481
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        char arr[] = str.toCharArray();

        System.out.println(str.length());
        System.out.println(arr.length);

        
        for(int i =0 ;i<arr.length;i++)
        {
            if(arr[i]>='A' && arr[i]<='Z')
            {
                arr[i]=(char)(arr[i]+32);
            }
        }
        String output = new String(arr);

        System.out.println(output);
    }
}

