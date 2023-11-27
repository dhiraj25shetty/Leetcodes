import java.util.*;

public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        int j = words.length-1;
        List<String> wordSet=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(!words[i].equals("")){
                wordSet.add(words[i]);
            }
        }
        StringBuilder newString= new StringBuilder();
        j=0;
        for(String word:wordSet){
            if(j==0) {
                newString.insert(0, word);
            }else{
                newString.insert(0, word + " ");
            }
            j++;
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        String s="  hello world  ";
        String ns=reverseWords(s);
        System.out.println(ns);
    }
}
