package Day3;

public class Solution05 {
    public String replaceSpace(String s){
        StringBuilder ans = new StringBuilder();
        for(char c:s.toCharArray()){
            if (c == ' ') ans.append("%20");
            else ans.append(c);
        }
        return ans.toString();
    }
}
