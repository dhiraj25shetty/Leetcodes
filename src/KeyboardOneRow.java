import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class KeyboardOneRow {
        public static String[] findWords(String[] words) {
            //String[] arr ={"qwertyuiop","asdfghjkl","zxcvbnm"};
            String sb1="qwertyuiop";
            String sb2="asdfghjkl";
            String sb3="zxcvbnm";
            ArrayList<String> wordList=new ArrayList<>();
            HashMap<Character,Integer> charRow=new HashMap<>();
            for(char s:sb1.toCharArray()){
                charRow.put(s, charRow.getOrDefault(s, 1));
            }
            for(char s:sb2.toCharArray()){
                charRow.put(s, charRow.getOrDefault(s, 2));
            }
            for(char s:sb3.toCharArray()){
                charRow.put(s, charRow.getOrDefault(s, 3));
            }
    //        for(int i=0;i<arr.length;i++){
    //            for(char s:arr[i].toCharArray()){
    //                charRow.put(s, charRow.getOrDefault(s, i+1));
    //            }
    //        }
            for(String word:words){
                int level=0;
                int checklevel=0;
                boolean flag=true;
                for(int i=0;i<word.length();i++){
                    char lowerCase=word.toLowerCase().charAt(i);
                    if(i==0 && charRow.containsKey(lowerCase)){
                        level=charRow.get(lowerCase);
                    }else {
                        checklevel = charRow.get(lowerCase);
                        if(checklevel!=level){
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag) {
                    wordList.add(word);
                }
            }
            return  wordList.toArray(new String[0]);
        }
    public static void main(String[] args) {
        String words[]={"Hello","Alaska","Dad","Peace"};
        String[] words1 = findWords(words);
        System.out.println(Arrays.toString(words1));
    }
}
