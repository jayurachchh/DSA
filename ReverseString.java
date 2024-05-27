import java.util.*;
class ReverseString
{
	public static String Reversed(String str)
	{
		String[] words=str.split(" ");
		
		//StringBuilder rev =new StringBuilder();

		String ReversedString="";

		for(int i=words.length-1;i>=0;i--)
		{
			//rev.append(words[i]);
			ReversedString += words[i]+" ";
		}
		return ReversedString;
		//return rev.toString();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str=sc.nextLine();

		String s=Reversed(str);
		System.out.println("Reverse String is "+s);	
	}
}