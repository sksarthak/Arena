import java.util.Arrays;

public class TestArrays {
    public static void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] x = TwoSums.twoSums(nums, target);
        System.out.println("{ " + x[0] + ", " + x[1] + " }");
    }

    public static void testTwoSum2() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] x = TwoSums.twoSums(nums, target);
        System.out.println("{ " + x[0] + ", " + x[1] + " }");
    }

    public static void testTwoSum2improved() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] x = TwoSums.twoSums(nums, target);
        System.out.println("{ " + x[0] + ", " + x[1] + " }");
    }

    public static void testRemoveDuplicates() {
        int[] nums = {0, 0, 1, 2, 2, 3, 4, 7, 11, 15};
        int x = RemoveDuplicatesfromSortedArray.removeDuplicates(nums);
        System.out.print("count: " + x + ", array: ");
        for (int i = 0; i < x; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

    public static void testRemoveDuplicates2() {
        int[] nums = {0, 0, 1, 2, 2, 3, 4};
        int x = RemoveDuplicatesfromSortedArray.removeDuplicates2(nums);
        System.out.print("count: " + x + ", array: ");
        for (int i = 0; i < x; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
