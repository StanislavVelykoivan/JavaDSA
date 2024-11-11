public class Main {
    public static void main(String[] args) {

        int[] nums = {6, 5, 2, 8, 9, 4};

        System.out.println("Befor");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(nums, 0, nums.length - 1);

        System.out.println("After");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);

            marge(nums, l, mid, r);
        }
    }

    private static void marge(int[] nums, int l, int mid, int r) {

        int size1 = mid - l + 1;
        int size2 = r - mid;

        int[] lArr = new int[size1];
        int[] rArr = new int[size2];

        for (int i = 0; i < size1; i++) {
            lArr[i] = nums[l + i];
        }

        for (int i = 0; i < size2; i++) {
            rArr[i] = nums[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < size1 && j < size2) {

            if (lArr[i] <= rArr[j]) {
                nums[k] = lArr[i];
                i++;
            } else {
                nums[k] = rArr[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            nums[k] = lArr[i];
            i++;
            k++;
        }
        while (j < size2) {
            nums[k] = rArr[j];
            j++;
            k++;
        }
    }
}