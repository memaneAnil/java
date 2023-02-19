import java.util.*;

class Program495
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");

        String str = sobj.nextLine();

        //char Arr[] = str.toCharArray();

        String Arr[] = str.split(" ");

        HashMap <String,Integer> hobj = new HashMap();

        int Frequency = 0;

        for(String ch : Arr)
        {
            if(hobj.containsKey(ch))
            {
                Frequency = hobj.get(ch);
                hobj.put(ch,Frequency+1);
            }
            else
            {
                hobj.put(ch,1);
            }
        }
        System.out.println(hobj);
        
        Set <String> setobj = hobj.keySet();

        for(String value : setobj)
        {
            System.out.println(value + " occurs" + hobj.get(value));//check
        }

        int iMax = 0;
        char cMax ;

        for(String value : setobj)
        {
            if(iMax < hobj.get(value))
            {
                iMax = hobj.get(value);
               // cMax = value;
            }
        }
        System.out.println(hobj);//---------------------

    }
}

