package Day3;

public class Solution58 {
    public String reverseLeftWords(String s, int n){
        StringBuilder s1 = new StringBuilder(s);
        s1.append(s.toCharArray(), 0, n);
        s1.delete(0, n);
        return s1.toString();
    }

}
