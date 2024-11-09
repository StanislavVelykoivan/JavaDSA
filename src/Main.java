public class Main {
    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 9};
        int target = 8;

        int result = binarySearch(nums, target);
        if (result != -1)
            System.out.println("Result: " + result);
        else
            System.out.println("Not found");
    }

    public static int binarySearch(int[] nums, int target) {

        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            steps++;

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps: " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Steps: " + steps);
        return -1;
    }

}