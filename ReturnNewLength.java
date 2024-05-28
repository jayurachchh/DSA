import java.util.*;
class ReturnNewLength 
{
		public static int Returnlength(int nums[],int val)
		{
			int i = 0; // pointer to place the non-val elements
        	for (int j = 0; j < nums.length; j++) 
        	{
            	if (nums[j] != val) 
            	{
                	nums[i] = nums[j];
                	i++;
	            }
        	}
        	return i;
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the Number of Element");
			int n=sc.nextInt();

			int arr[]=new int[n];
			{
				System.out.println("Enter the Element");
				for(int i=0;i<n;i++)
				{
					arr[i]=sc.nextInt();
				}
			}

			System.out.println("Enter the Number if you want to remove");
			int val=sc.nextInt();

			int length=Returnlength(arr,val);
			System.out.println("Length is"+length);

			for (int i=0;i<length;i++ ) 
			{
				System.out.println("Element is"+arr[i]);		
			}	
		}
}

