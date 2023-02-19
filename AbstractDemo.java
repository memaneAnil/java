abstract class Arithmatic
{
    public int Addition(int No1,int No2)
    {
        return No1+No2;
    }
    public abstract int Substraction(int No1,int No2);
  
}
class Marvellous extends Arithmatic
{
     public int Substraction(int No1,int No2)
     {
        return No1-No2;
     }
}
class AbstractDemo
{
    public static void main(String arg[])
    {
        Marvellous mobj=new Marvellous();
        //Arithmatic aobj=new Arithmatic();  //NA
        Arithmatic aobj=new Marvellous();//allowed
        int iRet=0;
        iRet=mobj.Addition(10,11);
        System.out.println("addition is :"+iRet);
        iRet=mobj.Substraction(10,11);
    }
}