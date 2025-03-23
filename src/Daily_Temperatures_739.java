import java.util.Stack;

public class Daily_Temperatures_739 {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] out = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                    int indice = stack.pop();
                    out[indice] = i - indice;
                }

            stack.push(i);
        }

        return out;
    }
}