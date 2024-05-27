import java.util.Scanner;

class Palindrome
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);  
        String a, b = "";

        System.out.print("Enter the string you want to check:");
        a = s.nextLine();

        a = a.replaceAll("[^a-zA-Z]", "").toLowerCase();
   
        for(int i = a.length()-1; i >= 0; i--)  
        {
            b = b + a.charAt(i); 
        }

        if(a.equalsIgnoreCase(b)) 
        {
            System.out.println("True");
        }  
        else  
        {
           System.out.println("The string is not palindrome.");  
        }
    } 
}    