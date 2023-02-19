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

        Scanner sobj = new Scanner(System.in);
        String Query = "";
        int QuerySize = 0;

        while(true)
        {
            System.out.print("Marvellous DBMS : >");
            Query = sobj.nextLine();

            String Tokens[] = Query.split(" ");

            QuerySize = Tokens.length;

            if(QuerySize == 1)
            {
                if("help".equals(Tokens[0]))
                {
                    System.out.println("This application used to demonstrate feature of customised dbms");
                    System.out.println("Display all the data : Select * from Student");
                    System.out.println("Insert new record : insert into student values Name Marks");
                    System.out.println("Terminate the project : exit");
                }
                else if("exit".equals(Tokens[0]))
                {
                    System.exit(0);
                }
            }
            else if(QuerySize == 2)
            {

            }
            else if(QuerySize == 3)
            {

            }
            else if(QuerySize == 4)
            {
                if("select".equals(Tokens[0]))
                {
                    if("*".equals(Tokens[1]))
                    {
                        DisplayAll();
                    }
                }
            }
            else if(QuerySize == 6)
            {
                if("insert".equals(Tokens[0]))
                {
                    if("student".equals(Tokens[2]))
                    {
                        Insert(Tokens[4],Integer.parseInt(Tokens[5]));
                    }
                }
            }
        }
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

class Program493
{
    public static void main(String arg[])
    {
        DBMS dobj = new DBMS();

        dobj.StartDBMS();
        
    }
}

