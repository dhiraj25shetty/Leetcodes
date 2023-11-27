import java.util.*;

public class MaxVowelsSubstring {
    public  int maxVowels(String s, int k) {
        //Set<Character> vowelSet= new LinkedHashSet<>(Arrays.asList('a','e','i','o','u'));
        int temp=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                temp++;
            }
        }
       int maxVowel = temp;
        int j=k;
        for(int i=1;i<s.length() &&j<s.length();i++){
            if(isVowel(s.charAt(i-1))){
                temp--;
            }
            if(isVowel(s.charAt(j))){
                temp++;
            }
            maxVowel = Math.max(temp,maxVowel);j++;
        }
        return maxVowel;
    }
    public boolean isVowel(char ch )
    {
        if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s="leetcode";
        int k = 3;
        MaxVowelsSubstring mx=new MaxVowelsSubstring();
        System.out.println(mx.maxVowels(s,k));
    }
}
