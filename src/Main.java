public class Main {
    public static void main(String[] args) {

        int[] nums = {6, 5, 2, 8, 9, 4};

        System.out.println("Befor");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int min = -1;
        int temp =  0;


        for (int i = 0; i < nums.length-1; i++) {
            min = i;
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[min] > nums[j] ){
                    min = j;
                }
            }
            temp =  nums[min];
            nums[min] =  nums[i];
            nums[i] = temp;
        }

        System.out.println("After");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}