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

    // Insert At tha End;
    public Node InsertEnd(int x)
    {
        Node new_node = new Node(x);

        if(head==null)
        {
            head=new_node;
            return head;
        }
        Node current = head;
        while(current.nextpoinnter !=null)
        {
            current=current.nextpoinnter;
        }
        current.nextpoinnter=new_node;
        return head;
    }

    // insert at order wise
    public Node InsertOrdered(int data) {
        Node new_node = new Node(data);

        if (head == null || head.data >= new_node.data) {
            new_node.nextpoinnter = head;
            head = new_node;
        } else {
            Node current = head;
            while (current.nextpoinnter != null && current.nextpoinnter.data < new_node.data) {
                current = current.nextpoinnter;
            }
            new_node.nextpoinnter = current.nextpoinnter;
            current.nextpoinnter = new_node;
        }
        return head;
    }

    // count the node
    public int Count()
    {
        int Count=0;
        Node current = head;
        if(head==null)
        {
            return 0;
        }
        
        while(current !=null)
        {
            current=current.nextpoinnter;
            Count++;
        }
        return Count;
    }

    // Delete At the First
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

    public LinkedList copyList() 
    {
        if (head == null) 
        {
            return null; // Return null if the list is empty
        }
        LinkedList newList = new LinkedList();
        Node current = head;

        // Create the head node for the new list
        newList.head = new Node(current.data);
        Node newCurrent = newList.head;
        
        current = current.nextpoinnter;

        while (current != null) 
        {
            newCurrent.nextpoinnter = new Node(current.data);
            newCurrent = newCurrent.nextpoinnter;
            current = current.nextpoinnter;
        }
        return newList;
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

class SimpleLinkedList
{
    public static void main(String[] args) 
    {
        LinkedList obj=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int valid=1;
        while (valid==1) 
        {
        System.out.println(" Welcome to in Singly LinkedList");
        System.out.println("Enter the Choise");
        System.out.println("1. Insert At the First");
        System.out.println("2. Insert At the Last");
        System.out.println("3. Insert At the Orderwise");
        System.out.println("4. Delete");
        System.out.println("5. Display");
        System.out.println("6. Count");
        System.out.println("7. Copy");


        int ch=sc.nextInt();
        switch (ch) {
            case 1: System.out.println("Enter the number of elements you want to insert");
                    int n=sc.nextInt(); 
                    System.out.println("Enter the Element");
                    for(int i=0;i<n;i++)
                    {
                        int data=sc.nextInt();
                        obj.Insert(data);
                    }
                    System.out.println("List is ");
                    obj.Display();            
                    break;
            case 2: System.out.println("Enter the number of elements you want to insert");
                    int n1=sc.nextInt(); 
                    System.out.println("Enter the Element");
                    for(int i=0;i<n1;i++)
                    {
                        int data=sc.nextInt();
                        obj.InsertEnd(data);
                    } 
                    System.out.println("List is ");
                    obj.Display();
                    break;
        
            case 3: System.out.println("Enter the number of elements you want to insert");
                    int n2=sc.nextInt(); 
                    System.out.println("Enter the Element");
                    for(int i=0;i<n2;i++)
                    {
                        int data=sc.nextInt();
                        obj.InsertOrdered(data);
                    } 
                    System.out.println("List is ");
                    obj.Display();
                    break;
            case 4: System.out.println("Enter the number of element elements you want to delete");
                    int deletecount=sc.nextInt();
                    for(int i=0;i<deletecount;i++)
                    {
                        obj.delete();
                    }
                    System.out.println("List is ");
                    obj.Display();
                    break;
            case 5: System.out.println("List is ");
                    obj.Display();
                    break;
            case 6:System.out.println("Count is "+obj.Count());
                    break;
            case 7: System.out.println("Original list:");
                    obj.Display();
                    
                    LinkedList copiedList = obj.copyList();
                    System.out.println("Copied list:");
                    copiedList.Display();
            default:
                break;
        }
        System.out.println("Do you want to continue  press 1");
        System.out.println("Exit press any Numeric key");
        valid=sc.nextInt();
        } 
        System.out.println("Thank You for Enjoying The Singly Linked List");
    }
}

