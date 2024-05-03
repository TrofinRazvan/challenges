package challenges;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = -1;
        int index  = search(nums,target);
        if (index != -1) {
            System.out.println(target + " exists in nums and it's on index " + index);
        } else {
            System.out.println(target + " does not exist in nums so return -1");
        }
    }
//Time Complexity - O(log n)
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}