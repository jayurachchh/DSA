import java.util.*;
class Bubblesort 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[100];
		int n,temp;

		System.out.println("Enter the Number of the element");
		n=sc.nextInt();

		System.out.println("Enter the Element");
		if(n<=100)
		{	
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
		else
		{
			System.out.println("array index out of bound and value should be less than 100");
		}	

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Element is"+arr[i]);
		}
	}	
}