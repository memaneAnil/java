class Demo
{
    public int No1;
    public int No2;

    Demo(int Value1,int Value2)
    {
        No1=Value1;
        No2=Value2;
    }
}
class HashcodeDemo
{
    public static void main(String arg[])
    {
        Demo obj=new Demo(10,11);
        Demo obj1=new Demo(10,11);

        String s1="Hello";
        String s2="Hello";


        System.out.println("hashcode is "+obj.hashCode());

        System.out.println("hashcode is "+s1.hashCode());
        System.out.println("hashcode is "+s2.hashCode());



        if(obj.equals(obj1))//
        {
            System.out.println("objects are same");
        }
        else
        {
            System.out.println("objects are not same");
        }
        if(obj==obj1)
        {
            System.out.println("objects are same");
        }
        else
        {
            System.out.println("objects are not same");
        }


         if(s1.equals(s2))
        {
            System.out.println("objects are same");
        }
        else
        {
            System.out.println("objects are not same");
        }
        //s1="Sagar";
         if(s1==s2)
        {
            System.out.println("objects are same");
        }
        else
        {
            System.out.println("objects are not same");
        }
    }
}