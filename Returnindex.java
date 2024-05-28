import java.util.*;
class Returnindex 
{
	public static int returnindex(int arr[],int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i; 
			}
			else if (arr[i] > target) 
			{
                return i;
            }
		}
		return arr.length;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element Number of element of array ");
		int n=sc.nextInt();

		int arr[]=new int[n];

		System.out.println("Enter the Element of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the Target Element of array ");
		int target=sc.nextInt();
		int index=returnindex(arr,target);
		System.out.println("Index is"+index);	
	}	
}