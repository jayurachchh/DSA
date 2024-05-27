		/*1        1
		12      21
		123    321
		1234  4321
		1234554321*/
		
import java.util.*;
class Pattern1
{
	static void patternspace(int n)
	{
		//initial space for row 1
		int spaces=2*(n-1);

		// outer loop for the rows
		for(int i=1;i<=n;i++)
		{
			// innner loop
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}

			// print the spaces
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}

			// reverse loop and printin the number
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}

			System.out.println();
			spaces-=2;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// take a user input 
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		//int n=4;
		// pass the user input into  the method
		patternspace(n);
	}
}