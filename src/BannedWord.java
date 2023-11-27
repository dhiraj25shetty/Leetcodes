import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BannedWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] split = paragraph.replaceAll("[^a-zA-Z0-9]", ",").toLowerCase().split(",");
       // String[] split = paragraph.split(",");
        HashMap<String,Integer> stringCount=new HashMap<>();
        List<String> bannedList= Arrays.asList(banned);
        List<String> wordList = Arrays.stream(split).filter(s->!bannedList.contains(s)).collect(Collectors.toList());
        for(String word:wordList){
            if(!word.equals("") && stringCount.containsKey(word)){
                stringCount.put(word,stringCount.get(word)+1);
            }else if(!word.equals("")){
                stringCount.put(word,1);
            }
        }
        String maxCountString = stringCount.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();

        return maxCountString;
    }
    public static void main(String[] args) {
        //String str="a, a, a, a, b,b,b,c, c";
        String str="Bob. hIt, baLl";
        String[] banned={"bob", "hit"};
        System.out.println(mostCommonWord(str,banned));
    }
}
