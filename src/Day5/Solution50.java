package Day5;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution50 {
    public char firstUniqChar(String s){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(Character ss: s.toCharArray()){
            try{
                Integer num = map.get(ss) + 1;
                map.put(ss, num);
            }catch (Exception e){
                map.put(ss, 1);
            }

        }
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            if((int) e.getValue() == 1){
                return (char) e.getKey();
            }
        }
        return ' ';
    }
}
