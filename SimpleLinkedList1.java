import java.util.Scanner;

public class SimpleLinkedList
{
    Node head;   
    public class Node 
    {
        int data;
        Node nextpoinnter;

        Node(int value)
        {
            data=value;
            nextpoinnter=null;
        }
    }

    public Node Insert(int data)
    {
        Node new_node =new Node(data);
        new_node.nextpoinnter=head;
        new_node=head;
        return head;
    }

    public void delete()
    {
        if(head==null)
        {
            System.out.println ("List is empty, not possible to delete");
            return;
        }
        System.out.println("Deleted"+head.data);
        head=head.nextpoinnter;  
    }

    public void Display()
    {
        Node node=head;
        while(node!=null)
        {
            System.out.print(node.data+",");
            node=node.nextpoinnter;
        }
        System.out.println();
    }
}

public class SimpleLinkedList
{
    public static void main(String[] args) 
    {
        SimpleLinkedList obj=new SimpleLinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to insert");
        int n=sc.nextInt();

        System.out.println("Enter the Element");
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            obj.Insert(data);
        }

        System.out.println("List");
        obj.Display();

        System.out.println("Enter the number of element elements you want to delete");
        int deletecount=sc.nextInt();

        for(int i=0;i<deletecount;i++)
        {
            obj.delete();
        }

        System.out.println("List");
        obj.Display();

    }
}
