import java.util.HashMap;

public class TwoSums {
    public static int[] twoSums(int[] nums, int target) {
        int[] rt = {-1, -1};
        BLOCK:
        {
            for (int i = 0; i < nums.length; i++) {
                rt[0] = i;
                int x = nums[i];
                int req = target - x;
                for (int j = i + 1; j < nums.length; j++) {
                    if (req == nums[j]) {
                        rt[1] = j;
                        break BLOCK;
                    }
                }
            }
        }
        return rt;
    }

    public static int[] twoSums2(int[] nums, int target) {
        // please see this as a reference for the next and not as a solution.
        // why? because it fails when there are repeated values in the array,
        // or only use this when it is know that the received set is non- repeating
        int[] rt = {-1, -1};
        HashMap<Integer, Integer> number_index_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            number_index_map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (number_index_map.containsKey(req)) {
                rt[0] = number_index_map.get(nums[i]);
                rt[1] = number_index_map.get(req);
                break;
            }
        }
        return rt;
    }

    public static int[] twoSums2improved(int[] nums, int target) {
        int[] rt = {-1, -1};
        // This one Works for the problem with repeated data

        HashMap<Integer, Integer> number_index_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (number_index_map.containsKey(req)) {
                rt[0] = number_index_map.get(req);
                rt[1] = i;
                break;
            }
            number_index_map.put(nums[i], i);
        }
        return rt;
    }
}
