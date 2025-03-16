import java.util.*;

class Top_K_Frequent_Elements_347 {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<>();

        for(int num:nums){
            int count = mp.getOrDefault(num, 0);
            mp.put(num, ++count);
        }

        List<int []> response_pair = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int key = entry.getKey();
            int count = entry.getValue();

            response_pair.add(new int[]{key, count});
        }

        response_pair.sort((a, b) -> Integer.compare(b[1], a[1]));

        int [] response = new int[k];
        for(int i = 0; i < k; i++){
            response[i] = response_pair.get(i)[0];
        }

        return response;
    }
}
