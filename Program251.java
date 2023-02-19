// Template for problem on Numbers.

import java.util.*;

class Numbers
{
    public void DisplayEvenFactor(int no)
    {
        for(int iCnt=2;iCnt<=(no/2);iCnt+=2)
        {
            if(no%iCnt==0)
            {
                
                System.out.println("Even Factor is :"+iCnt);
               
            }
        }
    }
}

class Program251
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please enter the number :");
        int iNo=sobj.nextInt();

        Numbers nobj=new Numbers();

        nobj.DisplayEvenFactor(iNo);
    }
}