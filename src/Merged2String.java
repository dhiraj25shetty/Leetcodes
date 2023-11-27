import java.util.Arrays;

public class Merged2String {
    public static String mergeAlternately(String word1, String word2) {
        int i=0;
        //int j=0;
        StringBuilder mergedStr=new StringBuilder();
        while(i<word1.length() && i<word2.length()){
            mergedStr.append(word1.charAt(i));
            mergedStr.append(word2.charAt(i));
            i++;
        }
        mergedStr.append(word1.substring(i));
        mergedStr.append(word2.substring(i));
        return  mergedStr.toString();
    }
    public static void main(String[] args) {
        String word1="ab";
        String word2="pqrs";
        String words = mergeAlternately(word1,word2);
        System.out.println(words);
    }
}
