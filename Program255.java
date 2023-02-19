// Template for problem on Numbers.

import java.util.*;

class Numbers
{
    public int FactorsMult(int no1)
    {
        
        int iMult=1;
        for(int iCnt=1;iCnt<=(no1/2);iCnt++)
        {
            if(no1%iCnt==0 )
            {
                iMult=iMult*iCnt;  
            }
        }
        return iMult;
    }
}

class Program255
{
    public static void main(String arg[])
    {
        int iRet=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please enter the number :");
        int iNo1=sobj.nextInt();

        

        Numbers nobj=new Numbers();

        iRet=nobj.FactorsMult(iNo1);
        System.out.println("Multification of factor "+iNo1+" is : "+iRet);
    }
}