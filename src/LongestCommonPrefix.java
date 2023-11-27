import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder longCommPfx=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                break;
            }else{longCommPfx.append(strs[0].charAt(i));}
        }
        return longCommPfx.toString();
    }
    public static void main(String[] args) {
        String[] strs = {"dog","dracecar","d"};
        System.out.println(longestCommonPrefix(strs));
    }
}
