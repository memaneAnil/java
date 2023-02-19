class Demo
{
    int Size;
    int Arr[];

    public Demo(int No)
    {
        System.out.println("Inside constructor");
        Size=No;
        Arr=new int[Size];
    }
    protected void finalize()
    {
        System.out.println("Inside finalize method");
        Arr=null;
    }
}

class FinalizedDemo
{
    public static void main(String arg[])
    {
        Demo obj=new Demo(10);
        obj=null;
        System.gc();
    }
}