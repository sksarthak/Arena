public class Main {
    public static void main(String[] args) {
        String problem_name = "RemoveDuplicates";
        switch (problem_name) {
            case "TwoSums": {
                System.out.println("response from testTwoSum : ");
                TestArrays.testTwoSum();

                System.out.println("response from testTwoSum2 : ");
                TestArrays.testTwoSum2();

                System.out.println("response from testTwoSum2improved : ");
                TestArrays.testTwoSum2improved();
                break;
            }
            case "RemoveDuplicates": {
                System.out.println("response from testRemoveDuplicates : ");
                TestArrays.testRemoveDuplicates();

                System.out.println("response from testRemoveDuplicates2 : ");
                TestArrays.testRemoveDuplicates2();
                break;
            }

        }
    }
}