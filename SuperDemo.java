class Base
{
    public int A,B;

    public Base(int no1,int no2)
    {
        this.A=no1;
        this.B=no2;
    }
    public void fun()
    {
        System.out.println("inside base fun");
        System.out.println("value of A from fun method is"+this.A);
    }
}
class Derived extends Base
{
    public int x,y;

    public Derived(int no1,int no2,int no3,int no4)
    {
        super(no3,no4);
        this.x=no1;
        this.y=no2;
    }
    public void gun()
    {
        System.out.println("value of A from derived gun"+super.A);
        super.fun();
    }

}
class SuperDemo
{
    public static void main(String arg[])
    {
        Derived dobj=new Derived(10,11,101,55);
        dobj.fun();
        dobj.gun();
    }
}