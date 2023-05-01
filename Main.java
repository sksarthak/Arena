public class Main {
    public static void main(String[] args) {
        String problem_name = "TwoSums";
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

        }
    }
}