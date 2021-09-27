package Day4;

public class Solution53x {
    public int search(int[] nums, int target){
        return helper(nums, target)-helper(nums, target-1);
    }
    public int helper(int[] nums, int target){
        int i = 0, j = nums.length-1;
        while (i <= j){
            int mid = (i + j)/2;
            if(nums[mid] <= target) i = mid + 1;
            else j = mid - 1;
        }
        return i;
    }
}
