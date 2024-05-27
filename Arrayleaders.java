import java.util.*;
class Arrayleaders 
{
	public static ArrayList<Integer>leaders(int[] arr,int n)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		// last element add to the array list because it is always leader
		ans.add(arr[n-1]);

		//assign last element as max element 
		int max=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>max)
			{
				ans.add(arr[i]);
				max=arr[i];
			}
		}
		return ans;

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[100];

		System.out.println("Enter the no of Element");
		int n=sc.nextInt();

		if(n<=100)
		{
			System.out.println("Enter the Element");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}	
		}
		else
		{
			 System.out.println("array index out of bound and value should be less than 100"); 
		}

		ArrayList<Integer> ans= leaders(arr,n);
		Collections.sort(ans, Collections.reverseOrder());
		System.out.println("Element is");
		for(int i=0;i<ans.size();i++)
		{

			System.out.println(ans.get(i)+"");
		}
	}	
}
