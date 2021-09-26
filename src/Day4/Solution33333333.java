package Day4;

public class Solution33333333 {
    public int findRepeatNumber(int[] nums){
        for(int i=0; i<nums.length;i++){
            if(nums[i] == i) continue;
            else if(nums[i] == nums[nums[i]]){
                return nums[i];
            }
        }
        return -1;
    }
}
