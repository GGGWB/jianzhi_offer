package Day4;

public class Solution344444444444 {
    public int findRepeatNumber(int[] nums){
        int i = 0;
        while(i<nums.length){
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[i] == nums[nums[i]]){
                return nums[i];
            }

            int temp;
            temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;

        }
        return -1;
    }
}
