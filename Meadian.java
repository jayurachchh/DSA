import java.util.*;
public class Meadian 
{
	public static int[] meargedarray(int arr1[],int arr2[])
	{
		int length=arr1.length+arr2.length;
		int meargearry[]=new int[length];

		for(int i=0;i<arr1.length;i++)
		{
			meargearry[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			meargearry[arr1.length+i]=arr2[i];
		} 
		return meargearry;
	}
	public static int[] Sortedarray(int sort[])
	{
		int temp=0;
		for(int i=0;i<sort.length;i++)
		{
			for(int j=0;j<sort.length-1;j++)
			{
				if(sort[j]>sort[j+1])
				{
					temp=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=temp;
				}
			}
		}
		return sort;
	}
	public static double meadian(int arr[])
	{
		double total=0;
		int length=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		total=total/length;
		return total; 
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element Number of element of array 1");
		int a1=sc.nextInt();

		int arr1[]=new int[a1];

		System.out.println("Enter the Element of array 1");
		for(int i=0;i<a1;i++)
		{
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter the Element Number of element of array 2");
		int a2=sc.nextInt();

		int arr2[]=new int[a2];

		System.out.println("Enter the Element of array 2");
		for(int i=0;i<a2;i++)
		{
			arr2[i]=sc.nextInt();
		}		

		int mearge[]=meargedarray(arr1,arr2);
		
		System.out.println("Merge Array is");
		for(int i=0;i<mearge.length;i++)
		{
			System.out.println(mearge[i]);
		}
		int sorted[]=Sortedarray(mearge);
		System.out.println("Sorted Array is");
		for(int i=0;i<sorted.length;i++)
		{
			System.out.println(sorted[i]);
		}

		System.out.println("Meadian is"+meadian(sorted));
	}	
}