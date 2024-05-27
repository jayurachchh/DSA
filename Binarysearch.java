import java.util.*;
public class Binarysearch 
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
        for(int i=0;i<n;i++)
        {
            System.out.println("Sorted array is "+arr[i]);
        }
		int left=0,right=n-1,middle;
        System.out.println("Enter the Key value");
        key=sc.nextInt();

        while(left<=right)
        {
        	middle=(left+right)/2;
        	if(arr[middle]==key)
        	{
        		System.out.println("Element are found and index is"+middle);
        		break;
        	}
        	else if(key<arr[middle])
        	{
        		right=middle-1;
        	}
        	else
        	{
        		left=middle+1;
        	}
        }
	}	
}