import java.util.Scanner;

class DemoEven implements Runnable
{
    public Data dobj;

    public DemoEven(Data obj)
    {
        dobj=obj;
    }
    public void run()
    {
        for(int iCnt=0;iCnt<dobj.Arr.length;iCnt++)
        {
            if(dobj.Arr[iCnt]%2==0)
            {
                System.out.println("Even number is :"+dobj.Arr[iCnt]);
            }
        }
    }
}
class DemoOdd implements Runnable
{
    public Data dobj;

    public DemoOdd(Data obj)
    {
        dobj=obj;
    }
    public void run()
    {
        for(int iCnt=0;iCnt<dobj.Arr.length;iCnt++)
        {
            if(dobj.Arr[iCnt]%2!=0)
            {
                System.out.println("odd number is :"+dobj.Arr[iCnt]);
            }
        }
    }
}

class Data
{
    public int Arr[];

    public Data(int size)
    {
        Arr=new int[size];

    }
    public void Accept()
    {

        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number\n");

        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }

    }
}

class ThreadDemo7
{
    public static void main(String arg[])
    {
        Data obj=new Data(10);
        obj.Accept();

        DemoEven deven=new DemoEven(obj);
        DemoOdd dodd=new DemoOdd(obj);

        Thread t1=new Thread(deven);
        Thread t2=new Thread(dodd);

        t1.start();
        t2.start();
    }
}