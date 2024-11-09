public class Main {
    public static void main(String[] args) {

        int[] nums = {8, 4, 9, 2, 6};
        int target = 2;

        int result = linearSearch(nums, target);
        if (result != -1)
            System.out.println("Result: " + result);
        else
            System.out.println("Not found");
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;

            if (target == nums[i]) {
                System.out.println("Steps: " + steps);
                return i;
            }
        }
        System.out.println("Steps: " + steps);
        return -1;
    }

}