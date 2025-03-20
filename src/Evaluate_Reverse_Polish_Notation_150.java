import java.util.Objects;
import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for(String token: tokens){
            if(Objects.equals(token, "+")){
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num1+num2);
            }
            else if (Objects.equals(token, "-")){
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num2-num1);
            }
            else if (Objects.equals(token, "*")){
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num1*num2);
            }
            else if (Objects.equals(token, "/")){
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num2/num1);
            }
            else{
                int num = Integer.parseInt(token);
                nums.push(num);
            }
        }

        return nums.pop();
    }
}
