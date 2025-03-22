import java.util.*;
public class ValidParentheses
{
    public static boolean isValid(String s) 
    {
        char[] stack = new char[s.length()];
        int top = -1;
        
        for (char ch : s.toCharArray()) 
        {
            if (ch == '(' || ch == '{' || ch == '[') 
            {
                stack[++top] = ch;
            } 
            else 
            {
                if (top == -1) 
                    return false;
                char topElement = stack[top--];
                if ((ch == ')' && topElement != '(') || (ch == '}' && topElement != '{') || (ch == ']' && topElement != '[')) 
                {
                    return false;
                }
            }
        }
        return top == -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String test1 = sc.nextLine();
        boolean result1 = isValid(test1);
        System.out.println(result1);
    }
}
