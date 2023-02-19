import java.util.Scanner;


class Program274
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter string");

        String str=sobj.nextLine();

        char Arr[]=str.toCharArray();

        //System.out.println(Arr); 

        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]);
        }
        System.out.println();
    }
}