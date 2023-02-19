import java.util.*;

class Sorting
{
    private int Arr[];

    public Sorting(int size)
    {
        Arr = new int[size];
    }
     
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");

        for(int i=0 ; i< Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Elements of array are : ");

        for(int i=0 ; i< Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class Program436
{
    public static void main(String arr[])
    {
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array");

        int size = sobj.nextInt();

        Sorting obj = new Sorting(size);

        obj.Accept();
        obj.Display();

    }
}