// Template for problem on Numbers.

import java.util.*;

class Numbers
{
    public void DisplayCommonFactor(int no1,int no2)
    {
        
        
        for(int iCnt=1;iCnt<=(no1/2)&& iCnt<=(no2/2);iCnt++)
        {
            if(no1%iCnt==0 && no2%iCnt==0)
            {
                System.out.println("Common Factor is :"+iCnt);  
            }
        }
    }
}

class Program254
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please enter the number :");
        int iNo1=sobj.nextInt();

        System.out.println("Please enter the number :");
        int iNo2=sobj.nextInt();

        Numbers nobj=new Numbers();

        nobj.DisplayCommonFactor(iNo1,iNo2);
    }
}