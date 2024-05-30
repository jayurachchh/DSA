
import java.util.Scanner;

public class Palindromenum {

    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        int number = s.nextInt();

        boolean value=isPalindrome(number);
        System.out.println(value);
        s.close();
    }
}
