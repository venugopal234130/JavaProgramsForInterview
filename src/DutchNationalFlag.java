import java.util.Arrays;

public class DutchNationalFlag {
    public static void sortColors(int[] nums) {
        int low = 0;        // For next 0
        int mid = 0;        // Current element
        int high = nums.length - 1;  // For next 2
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // Swap 0 to the front
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // Move mid forward
                    mid++;
                    break;

            /*    case 2:
                    // Swap 2 to the end
                    swap(nums, mid, high);
                    high--;e
                    break; */
            }
        }
    }

    // Utility method to swap elements
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Test the method
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));  // Output: [0, 0, 1, 1, 2, 2]
    }
}
