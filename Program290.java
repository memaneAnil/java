import java.util.Scanner;

class Pattern
{
    public void Display(String s)
    {
       char arr[]=s.toCharArray();

       for(int i=0;i<arr.length;i++)
       {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j]+"\t");
            }
            System.out.println();
       }
    }

    public void Display1(String s)
    {
       for(int i=0;i<s.length();i++)
       {
            for(int j=0;j<s.length();j++)
            {
                System.out.print(s.charAt(j)+"\t");
            }
            System.out.println();
       }
    }
}
class Program290
{
    public static void main(String arr[])
    {
        Pattern pobj=new Pattern();
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the String\n");
        String s=sobj.nextLine();
        
        pobj.Display(s);
         System.out.println("____________________\n");
        pobj.Display1(s);
    }
}