import java.util.Stack;

public class valid_parentheses_20 {
    public boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '{' || c == '[' || c == '(')
                stack.add(c);
            else if (!stack.isEmpty()){
                char d = stack.peek();
                if(d == '(' && c == ')')
                    stack.pop();
                else if(d == '[' && c == ']')
                    stack.pop();
                else if(d == '{' && c == '}')
                    stack.pop();
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
