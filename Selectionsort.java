import java.util.*;
public class Selectionsort
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[100];
		int n=0;
		System.out.println("Enter the number of the element");
		n=sc.nextInt();

		System.out.println("Enter the element");
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
			int minvalue=arr[i];
			int minindex=i;
			for(int j=i+1;j<n;j++)
			{
				if(minvalue>arr[j])
				{
					minvalue=arr[j];
					minindex=j;
				}	
			}
			arr[minindex]=arr[i];
			arr[i]=minvalue;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Element is"+arr[i]);
		}	
	}
}