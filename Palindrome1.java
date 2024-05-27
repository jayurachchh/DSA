import java.util.*;
class Palindrome1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String a=sc.nextLine();

		boolean value= Palindome(a);	

		System.out.println(value);
	}
	public static boolean Palindome(String str)
	{
		String a, b="";
		a = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		return a.equalsIgnoreCase(b);
	}	
}