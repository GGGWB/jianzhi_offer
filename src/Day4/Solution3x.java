package Day4;

import java.util.HashSet;
import java.util.Set;

public class Solution3x {
    public int findRepeatNumber(int[] nums){
        Set<Integer> dic = new HashSet<>();
        for(int num :nums){
            if (dic.contains(num)) return num;
            dic.add(num);
        }
        return -1;
    }


}
