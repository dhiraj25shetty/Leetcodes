import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class commonCharactersInArray {
    public static List<String> commonChars(String[] words) {
        int totalWords=words.length-1;
        List<String> arr=new ArrayList<>();
        Map<Character,Integer> alphas=new HashMap<>();
        for(Character c:words[0].toCharArray()){
            if(alphas.containsKey(c)){
                alphas.put(c,alphas.get(c)-totalWords);
            }else{
                alphas.put(c,-totalWords);
            }
        }
        for(int i=1;i<words.length;i++){
            boolean isExistingWord=false;
            for(Character c:words[i].toCharArray()){
                isExistingWord=true;
                if(alphas.containsKey(c)){
                    alphas.put(c,alphas.get(c)+1);
                }
            }
        }
        for(Character c:alphas.keySet()){
            if(alphas.get(c)>=0){
                System.out.println("key>"+c+"<:>"+alphas.get(c));
                arr.add(String.valueOf(c));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String words[] = {"bella","roller","label"};
        List<String> p = commonChars(words);

        System.out.println("common charater: " + p);
    }
}
