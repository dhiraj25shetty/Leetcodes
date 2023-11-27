import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int left=0;int right=0;int length=0;
        Set<Character> chars=new HashSet<>();
        for( right=0;right<s.length();right++){
            if(!chars.contains(s.charAt(right)))
            {
                chars.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
            }else{
                while (chars.contains(s.charAt(right))) {
                    chars.remove(s.charAt(left));
                    left++;
                }
                chars.add(s.charAt(right));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s="abcab";
        int length = lengthOfLongestSubstring(s);
        System.out.println("non repeated suubstinrng longest: " + length);
    }

}
