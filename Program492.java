import java.util.*;

class Student
{
    public String Sname;
    public int Marks;
    public int Rollno;

    public static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str,int no)
    {
        this.Sname = str;
        this.Marks = no;
        Generator++;
        this.Rollno = Generator;
    }

    public void Display()
    {
        System.out.println("Rollno : "+Rollno+" Name : "+ Sname+ " Marks : "+Marks);
    }
}
class DBMS
{
    public LinkedList<Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList();
    } 
    public void StartDBMS()
    {
        System.out.println("Marvellous Customised DBMS started successfully...");
    } 
    public void Insert(String str , int no)//insert
    {
        Student sobj = new Student(str,no);
        lobj.add(sobj);
    } 
    public void DisplayAll()//select
    {
        for(Student sref : lobj)
        {
            sref.Display();
        }
    }
    public void DisplaySpecific(int value)//rollno
    {
        for(Student sref : lobj)
        {
            if(sref.Rollno == value)
            {
                sref.Display();
                break;
            }
            
        }
    }
    public void DisplaySpecific(String str)//name
    {
        for(Student sref : lobj)
        {
            if(str.equals(sref.Sname))
            {
                sref.Display();
                break;
            }
            
        }
    }
    public void delete(int no)
    {
        int index = 0;

        for(Student sref : lobj)
        {
            if(sref.Rollno == no)
            {
                lobj.remove(index);
                break;
            }
            index++;
        }
    }
    public void delete(String str)
    {
        int index = 0;

        for(Student sref : lobj)
        {
            if(str.equals(sref.Sname))
            {
                lobj.remove(index);
                break;
            }
            index++;
        }
    }
    public void Sum()
    {
        int iSum= 0;

        for(Student sref : lobj)
        {
            iSum = iSum + (sref.Marks);
        }
        System.out.println("Sum of Marks is : "+iSum);
    }
    public void Min()
    {
        Student s= lobj.get(0);
        int iMin=0;

        iMin = s.Marks;

        for(Student sref : lobj)
        {
           if(sref.Marks<iMin)
           {
                iMin = sref.Marks;
           }
        }
        System.out.println("Min Marks is : "+iMin);
    }
    public void Average()
    {
        int iSum= 0;

        for(Student sref : lobj)
        {
            iSum = iSum + (sref.Marks);
        }
        System.out.println("Average of Marks is : "+(iSum/lobj.size()));
    }

}

class Program492
{
    public static void main(String arg[])
    {
        DBMS dobj = new DBMS();

        dobj.StartDBMS();
        dobj.Insert("Kartik",90);
        dobj.Insert("Rutuja",96);
        dobj.Insert("Ankit",80);
        dobj.Insert("Pooja",67);
        dobj.Insert("Ram",85);

        dobj.DisplayAll();
        dobj.DisplaySpecific(3);
        dobj.DisplaySpecific("Rutuja");

        System.out.println("--------------------------");

        dobj.delete(3);
        dobj.DisplayAll();
        System.out.println("--------------------------");
        dobj.delete("Ram");
        dobj.DisplayAll();
        System.out.println("--------------------------");
        dobj.Sum();
        dobj.Min();
        dobj.Average();
    }
}

