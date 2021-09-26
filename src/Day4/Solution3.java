package Day4;

import java.util.HashMap;

public class Solution3 {
    public int findRepeatNumber(int[] nums){
        HashMap<Integer, Integer> ref = new HashMap<>();
        int[] ans = new int[nums.length];
        int a = 0;
        for(Integer i: nums){
            try{
                if(ref.get(i).equals(i)){
                    ans[a] = i;
                    a++;
                }
            }catch (Exception e){
                ref.put(i, i);
            }
//            if(ref.get(i).equals(i)){
//                ans[a] = i;
//                a++;
//            }else{
//                ref.put(i,i);
//            }
        }
        return ans[0];
    }
}
//思路是利用hashmap，将元素作为key和value放进去，边放边查，如果下一个查到已经放进去了，就是重复的。否则不重复，就放进去
//里面需要注意的是 hashmap不能用基本数据类型，另一方面是，查不到会报空指针异常，需要用异常捕获。
