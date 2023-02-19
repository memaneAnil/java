//424 498 7223
//8(Asz2@e

import java.util.Scanner;

class ArrayX
{ 
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr=new int[iSize];
    }
    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please enter "+Arr.length+"elements");

        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println("Enter the element no : "+(iCnt+1)); 
            Arr[iCnt]=sobj.nextInt();
        }

    }
    public void Display()
    {
        System.out.println("Elements of array are : \n");
        
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
        System.out.println("\n");
    }
}
class MarvellousX extends ArrayX
{
    ArrayX obj;
    public MarvellousX(int iSize)
    {
       super(iSize);
    }
    public int Addition()
    {
        int iSum=0;
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            iSum=iSum+Arr[iCnt];
        }
        return iSum;
    }
}
class Program260
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iSize=0,iRet=0;

        System.out.println("Enter the number of elements in array");

        iSize=sobj.nextInt();

        MarvellousX obj=new MarvellousX(iSize);

        obj.Accept();

        obj.Display();

        iRet=obj.Addition();

        System.out.println("Addition is :"+iRet);
    }
    
}