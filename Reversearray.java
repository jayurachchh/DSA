import java.util.*;
public class Reversearray  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		int n=0;
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
		for(int i=n-1;i>=0;i--)
		{
			System.out.println("The element is"+arr[i]);
		}	
	}	
}