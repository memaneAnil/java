import java.util.Scanner;
class Arithmetic
{
    public int Division(int A,int B)throws ArithmeticException
    {
        int Ans=0;
        Ans=A/B;
        return Ans;
    }
}
class ThrowsDemo
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter first number");
        int iNo1=sobj.nextInt();
        System.out.println("Enter the second number");
        int iNo2=sobj.nextInt();

        Arithmetic aobj=new Arithmetic();
        try
        {
            int iRet=aobj.Division(iNo1,iNo2);
            System.out.println("Divisin is :"+iRet);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception occured");
            System.out.println(obj);
        }
        
    }
}
