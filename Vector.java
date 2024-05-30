import java.util.*;
public class Vector 
{
	public static List<Integer> majorityElement(int []v) 
	{
		int n = v.length; //size of the array
		List<Integer> ls = new ArrayList<>(); // list of answers
		
		//declaring a map:
		HashMap<Integer, Integer> mpp = new HashMap<>();
		
		// least occurrence of the majority element:
		int mini = (int)(n / 3) + 1;
		
		//storing the elements with its occurnce:
		for (int i = 0; i < n; i++) 
		{
			int value = mpp.getOrDefault(v[i], 0);
			mpp.put(v[i], value + 1);
			
			//checking if v[i] is
			// the majority element:
			if (mpp.get(v[i]) == mini) 
			{
				ls.add(v[i]);
			}
			if (ls.size() == 2) 
				break;
		}
		return ls;
	}
	public static void main(String args[]) 
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

		//int[] arr = {11, 33, 33, 11, 33, 11};
		List<Integer> ans = majorityElement(arr1);
		System.out.print("The majority elements are: ");
		
		for (int i = 0; i < ans.size(); i++) 
		{
			System.out.print(ans.get(i) + " ");
		}
			System.out.println();
	}
}