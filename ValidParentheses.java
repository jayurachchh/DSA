import java.util.Scanner;
import java.util.Stack;;

/*  Valid Parenthesis
Input          Output 
()(())        True(1)
(()()         False(0)
))((          False(0)
 * 
*/

public class ValidParentheses {

    public static boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < T; i++) {
            String str = scanner.nextLine();
            System.out.println(isValidParentheses(str) ? 1 : 0);
        }
        scanner.close();
    }
}
