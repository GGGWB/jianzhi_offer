package Day5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution50x {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(Map.Entry<Character, Boolean> d : dic.entrySet()){
            if(d.getValue()) return d.getKey();
        }
        return ' ';
    }
}
// 用是否包含即可，不用我的查出实际数字，这个如果不存在的话会导致抛出异常