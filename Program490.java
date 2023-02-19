import java.util.*;


class Program490
{
    public static void main(String arg[])
    {
        LinkedList <Integer> obj = new <Integer>LinkedList();

        obj.add(11);
        obj.add(21);
        obj.add(51);

        obj.remove(1);

        System.out.println("Data is : "+obj);

        for(int no : obj)
        {
            System.out.println(no);
        }
    }
}

