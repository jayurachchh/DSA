// import java.util.PriorityQueue;

// public class Priorityqueue {
//     public static void main(String[] args) {
//         // Create a PriorityQueue of integers
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         // Add elements to the PriorityQueue
//         pq.add(10);
//         pq.add(20);
//         pq.add(15);
//         pq.add(30);
//         pq.add(5);

//         // Display the PriorityQueue
//         System.out.println("PriorityQueue: " + pq);

//         // Remove the element at the head of the PriorityQueue
//         int head = pq.poll(); // poll() removes and returns the head of the queue
//         System.out.println("Removed head: " + head);
//         System.out.println("PriorityQueue after removing head: " + pq);

//         // Peek at the head of the PriorityQueue without removing it
//         head = pq.peek(); // peek() returns the head of the queue without removing it
//         System.out.println("Current head: " + head);

//         // Iterating through the elements of the PriorityQueue
//         System.out.println("Iterating through the PriorityQueue:");
//         for (Integer element : pq) {
//             System.out.println(element);
//         }
//     }
// }
import java.util.PriorityQueue;
import java.util.Scanner;

public class Priorityqueue {

    public static int findKthLargest(int[] nums, int k) {
        // Create a pq
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the pq
        for (int num : nums) {
            pq.add(num);
            // If the size of the heap exceeds k, remove the smallest element
            if (pq.size() > k) {
                pq.poll(); // Remove the smallest element
            }
        }

        // The root of the min-heap is the kth largest element
        return pq.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Taking input for the array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking input for k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Finding and printing the kth largest element
        int result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);

        sc.close();
    }
}

