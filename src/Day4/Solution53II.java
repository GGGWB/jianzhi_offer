package Day4;

public class Solution53II {
    public int missingNumber(int[] nums) {
        int right = nums.length-1;
        if(right==0){
            if (nums[0] == 0) return 1;
            else return 0;

        }
        int left = 0;
        while(left <= right){
            int mid = (int) (left + right)/2;
            if(nums[mid] == mid){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
}
