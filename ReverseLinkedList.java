import java.util.Scanner;
class LinkedList
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

        // Insert At the First
        public Node Insert(int data)
        {
            Node new_node =new Node(data);
            new_node.nextpoinnter=head;
            head=new_node;
            return head;
        }
        
        // Display
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
public class ReverseLinkedList 
{
    public static void main(String[] args) 
    {
        LinkedList obj=new LinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to insert");
        int n=sc.nextInt(); 
        System.out.println("Enter the Element");
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            obj.Insert(data);
        }
        System.out.println("Reverse List is ");
        obj.Display();         
    }    
}
