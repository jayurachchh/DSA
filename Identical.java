public class Identical 
{
        Node head; // head of list
    
        // Node class
        class Node {
            int data;
            Node next;
    
            Node(int d) {
                data = d;
                next = null;
            }
        }

        // Insert new node at the end
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }    
        // Display the linked list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    
        // Check if two linked lists are identical
        public static boolean areIdentical(Identical list1, Identical list2) {
            Node head1 = list1.head;
            Node head2 = list2.head;
    
            while (head1 != null && head2 != null) {
                if (head1.data != head2.data) {
                    return false;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
    
            return head1 == null && head2 == null;
        }
    
        public static void main(String[] args) {
            Identical list1 = new Identical();
            Identical list2 = new Identical();
    
            list1.insert(1);
            list1.insert(2);
            list1.insert(3);
            list2.insert(1);
            list2.insert(2);
            list2.insert(3);
    
            System.out.println("List 1:");
            list1.display();
            
            System.out.println("List 2:");
            list2.display();
    
            if (Identical.areIdentical(list1, list2)) {
                System.out.println("The linked lists are identical.");
            } else {
                System.out.println("The linked lists are not identical.");
            }
        }
    }
    
