import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(nums[i])){

                int [] response = new int[]{i, map.get(nums[i])};
                Arrays.sort(response);
                return response;
            }

            map.put(diff, i);
        }

        return nums;
    }
}
