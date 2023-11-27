import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        char[] charArray = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char c: charArray){
            if(vowels.indexOf(c)!=-1){
                sb.append(c);
            }
        }
        sb.reverse();   //eeoe  eoee
        int k=0;
        for(int i=0;i<charArray.length;i++){
            if(vowels.indexOf(charArray[i])!=-1){
                charArray[i]= sb.charAt(k);
                k++;
            }
        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        String s="hello";
        String finalString = reverseVowels(s);
        System.out.println(finalString);
    }
}
