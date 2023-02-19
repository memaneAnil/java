import java.util.Scanner;

import Marvellous.Demopackage;

import Marvellous.PPA.loop;

class Demo
{
    public static void main(String arr[])
    {
        int iNo1=0,iNo2=0;
        Scanner sobj=new Scanner(System.in);

        iNo1=sobj.nextInt();
        iNo2=sobj.nextInt();

        Demopackage dobj=new Demopackage(iNo1,iNo2);

        int iRes=dobj.addition();

        System.out.println("addition is :"+iRes);

        System.out.println("Substraction is :"+dobj.substraction());

        loop lobj=new loop();

        lobj.display();



    }
}