// Template for problem on Numbers.

import java.util.*;

class Numbers
{
    private int CountDigits(int iNo)
    {
        int iCnt=0;
        while(iNo!=0)
        {
            iCnt++;
            iNo=iNo/10;
        }
        return iCnt;
    }

    private int Power(int Base,int index)
    {
        int iAns=1;
        for(int i=1;i<=index;i++)
        {
            iAns=iAns*Base;
        }
        return iAns;
    }

    public boolean CheckArmstrong(int iNo)
    {
        
        int iSum=0;
        int iTemp=iNo;
        int iDigit=0;

        int iCount=CountDigits(iNo);

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iSum=iSum+Power(iDigit,iCount);
            iNo=iNo/10;
        }
        if(iTemp==iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program256
{
    public static void main(String arg[])
    {
        boolean bRet=false;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please enter the number :");
        int iNo1=sobj.nextInt();


        Numbers nobj=new Numbers();
        bRet=nobj.CheckArmstrong(iNo1);
        if(bRet==true)
        {
            System.out.println(iNo1+ " is a ArmStrong number ");
        }
        else
        {
            System.out.println(iNo1+ " is not a ArmStrong number ");
        }
        
    }
}