import java.util.*;

class Node
{
    public int Data;
    public Node Next;

    public Node(int No)
    {
        this.Data = No;
        this.Next = null;
    }
}

class SinglyLL
{
    private Node Head;
    private int Count;

    public SinglyLL()
    {
        Head = null;
        Count = 0;
    }

    protected void finalize()
    {

    }

    public void insertFirst(int No)
    {
        Node newn = new Node(No);
        //newn.Data = no;
        //newn.Next = null;
        if(this.Head == null)
        {
            this.Head = newn;
        }
        else
        {
            newn.Next = this.Head;
            this.Head = newn;
        }
        this.Count++;
    }


   
    public void Display()
    {
        Node temp = this.Head;
        while(temp != null)
        {
            System.out.print("| "+temp.Data + " | ->");
            temp = temp.Next;
        }
        System.out.println("NULL");
    }

    public int CountNodes()
    {
        return this.Count;
    }

    public void insertLast(int No)
    {
        Node newn = new Node(No);

        if(this.Head == null)
        {
            this.Head = newn;
        }
        else
        {
            Node temp = Head;

            while(temp.Next!= null)
            {
                temp = temp.Next;
            }

            temp.Next = newn;
        }

        this.Count++;
    }
    public void deleteFirst()
    {
        if(this.Count == 0)
        {
            return;
        }
        else if(this.Count == 1)
        {
            this.Head = null;
        }
        else
        {
            Head = Head.Next;
        }
        this.Count--;
    }
    public void deleteLast()
    {
        if(this.Count == 0)
        {
            return;
        }
        else if(this.Count == 1)
        {
            this.Head = null;
        }
        else
        {
            Node temp = this.Head;

            while(temp.Next.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = null;
        }
        this.Count--;
    }
    public void insertAtPos(int No,int ipos)
    {
        if(ipos<1 || ipos >this.Count+2)
        {

            return;
        }
        if(ipos == 1)
        {
            this.insertFirst(No);
        }
        else if(ipos == this.Count+1)
        {
            this.insertLast(No);
        }
        else
        {
            Node temp = Head;
            Node newn = new Node(No);
            for(int i= 1 ; i< ipos-1; i++)
            {
                temp = temp.Next;
            }
            newn.Next = temp.Next;
            temp.Next = newn;
            this.Count++;
        }
        
    }
    public void deleteAtPos(int ipos)
    {
        if(ipos<1 || ipos >this.Count+1)
        {
            return;
        }
        if(ipos == 1)
        {
            this.deleteFirst();
        }
        else if(ipos == this.Count)
        {
            this.deleteLast();
        }
        else
        {
            Node temp = Head;
            
            for(int i= 1 ; i< ipos-1; i++)
            {
                temp = temp.Next;
            }

            temp.Next = temp.Next.Next;
            this.Count--;
        }
        
    }
}

class Program445
{
    public static void main(String arr[])
    {
        SinglyLL obj = new SinglyLL();
        obj.insertFirst(51);
        obj.insertFirst(21);
        obj.insertFirst(11);
        obj.Display();

        int ret = obj.CountNodes();
        System.out.println("Number of nodes are : "+ret);

        obj.insertLast(101);
        obj.insertLast(111);
        obj.insertLast(121);

        obj.insertAtPos(999,5);

        //obj.deleteFirst();
        //obj.deleteLast();

        obj.Display();

        ret = obj.CountNodes();
        System.out.println("Number of nodes are : "+ret);

        obj.deleteAtPos(5);

        obj.Display();

        ret = obj.CountNodes();
        System.out.println("Number of nodes are : "+ret);

        
    
    }
}