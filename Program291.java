import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iDigit=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            System.out.print(iDigit+"\t");
            iNo=iNo/10;
        }
        System.out.println();
    }
}
class Program291
{
    public static void main(String arr[])
    {
        Pattern pobj=new Pattern();
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number\n");
        int no=sobj.nextInt();
        
        pobj.Display(no);
        
    }
}