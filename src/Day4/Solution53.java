package Day4;

public class Solution53 {
    public int search(int[] nums, int target){
        int i = 0;
        for(int x: nums){
            if(x == target) i++;

        }
        return i;
    }
}
