
class Base
{
    public int a,b;

    public Base()
    {
        this.a=10;
        this.b=20;
    }
    public void fun()
    {
        System.out.println("Inside Base fun");
    }
    public void fun(int a)
    {
        System.out.println("Inside Base parameterised fun ");
    }
    public void gun()
    {
        System.out.println("Inside Base gun");
    }
    public void sun()
    {        
        System.out.println("Inside Derived sun");
    }
}
class Derived extends Base
{
    public int x,y;

    public Derived()
    {
        this.x=30;
        this.y=40;
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
    
}
class ReusabilityDemo
{
    public static void main(String arr[])
    {
        Base bobj=new Base();
        Derived dobj=new Derived();
        Base bobj1=new Derived();
       // Derived dobj1=new Base(); downcasting    typecasting

       bobj1.fun();
       bobj1.fun(10);
       bobj1.gun();
       bobj1.sun();


    }
}