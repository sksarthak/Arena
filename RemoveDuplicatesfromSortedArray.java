public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int placer = 0;
        int ref = -101;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > ref) {
                nums[placer] = nums[i];
                ref = nums[i];
                placer++;
            }
        }

        return placer;
    }

    public static int removeDuplicates2(int[] nums) {
        int p1 = 0;
        for (int p2 = 1; p2 < nums.length; p2++) {
            if (nums[p2] > nums[p1]) {
                nums[++p1] = nums[p2];
            }
        }
        return (p1 + 1);
    }

}
