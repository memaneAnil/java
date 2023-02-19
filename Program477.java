import java.util.*;

class Program477
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        char arr[] = str.toCharArray();

        System.out.println(str.length());
        System.out.println(arr.length);

        int Count=0;

        for(int i =0 ;i<arr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                Count++;
            }
        }

        System.out.println("Number of small character are : "+Count);
        Count=0;
        for(char ch : arr)
        {
            if(ch>='a' && ch<='z')
            {
                Count++;
            }
        }
        System.out.println("Number of small character are : "+Count);

        int i=0;
        Count=0;
        while(i<arr.length)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                Count++;
            }
            i++;
        }
        System.out.println("Number of small character are : "+Count);
    }
}

