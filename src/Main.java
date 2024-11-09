public class Main {
    public static void main(String[] args) {

        int nums[] = {8,4,9,2,6};
        int target = 2;

        int result = linearSearch(nums, target);
        if (result != -1)
            System.out.println(result);
        else
            System.out.println("Not found");
    }

    public static int linearSearch(int[] nums, int target) {
        for (int num : nums) {
            if (target == num)
                return num;
        }
        return -1;
    }

}