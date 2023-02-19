//424 498 7223
//8(Asz2@e

import java.util.Scanner;

class ArrayX
{ 
    protected int Arr[];

    public ArrayX(int iSize)
    {
        Arr=new int[iSize];
    }
    protected void Accept()
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please enter "+Arr.length+"elements");

        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println("Enter the element no : "+(iCnt+1)); 
            Arr[iCnt]=sobj.nextInt();
        }

    }
    protected void Display()
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

    public void Reverse()
    {
        int iCnt1=Arr.length-1;
        int temp=0;
        for(int iCnt=0;iCnt<Arr.length;iCnt++,iCnt1--)
        {
                temp=Arr[iCnt];
                Arr[iCnt]=Arr[iCnt1];
                
                Arr[iCnt1]=Arr[temp];
            //iCnt1--;
        }
        
    }

}
class Program265
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
       
        System.out.println("Enter the number of elements in array");

        int iSize=sobj.nextInt();

        MarvellousX obj=new MarvellousX(iSize);

        obj.Accept();

        obj.Display();

        obj. Reverse();

        obj.Display();

        //System.out.println("Addition is :"+iRet);
    }
    
}