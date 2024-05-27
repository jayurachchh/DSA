import java.util.*;
public class Linearsearch  
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int [100];
        int n,key,index=0,count=0;

        System.out.println("Enter the number of element");
        n=sc.nextInt();
        if(n<=100)
        {
            System.out.println("Enter the element");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
        }
        else
        {
            System.out.println("array index out of bound and value should be less than 100");
        } 
        Arrays.sort(arr, 0, n);
        
        System.out.println("Enter the Key value");
        key=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            /*System.out.println("Enter the Key value"+arr[i]);*/
            if(arr[i]==key)
            {
                index=i;
                count=1;
            }
        }
        if(count==1)
        {
            System.out.println("Element are found and index is"+index);
        }
        else
        {
            System.out.println("Element are not found");
        }     
    }   
}