import java.util.Arrays;

public class Product_of_Array_Except_Self_238 {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];

        int mult = 1;
        for(int num:nums){
            if(num != 0){
                mult *= num;
            }
        }
        if(Arrays.stream(nums).filter(elemento -> elemento == 0).count() >= 2){
        }
        else if(Arrays.stream(nums).anyMatch(n -> n==0)){
            for(int i = 0; i < result.length; i++){
                if(nums[i] != 0){
                    result[i] = 0;
                }
                else
                    result[i] = mult;
            }
        }
        else {
            for(int i = 0; i < result.length; i++){
                result[i] = mult/nums[i];
            }
        }

        return result;
    }
}
