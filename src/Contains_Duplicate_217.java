import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_217 {

    public boolean hasDuplicate(int[] nums) {

        Map<Integer, Boolean>  map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, true);
        }

        return false;

//        Arrays.sort(nums);
//
//        for (int i = 1; i < nums.length; i++){
//            if (nums[i-1] == nums[i])
//                return true;
//        }
//        return false;
    }
}
