import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {

    public static int singleNumberXOR(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x = x ^ nums[i];
        }
        return (int) x;
    }

    // Alternate Ways to do this
    public static int singleNumberHashmap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length / 2 + 1);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], 2);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer value : map.keySet()) {
            if (map.get(value) == 1) {
                return value;
            }
        }
        return -1;
    }

    public static int singleNumberSets(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int sumArray = 0;
        int sumSet = 0;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            sumArray += nums[i];
        }

        for (Integer x : set) {
            sumSet += (x + x);
        }
        return sumSet - sumArray;
    }

}
