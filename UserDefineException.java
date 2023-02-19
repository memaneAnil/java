import java.util.Scanner;

class UserDefineException
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter your age");
        int iAge=sobj.nextInt();

        try
        {
            if(iAge<15)
            {
                AgeInvalidException obj=new AgeInvalidException("Your age is less than 15");

                throw obj;

               // throw new AgeInvalidException("Your age is less than 15");

            }
            else
            {
                System.out.println("Age is valid");
            }
        }
        catch(AgeInvalidException obj)
        {
            System.out.println(obj);
        }
        
        
    }
}
class AgeInvalidException extends Exception
{
    AgeInvalidException(String str)
    {
        super(str);
    }
}

