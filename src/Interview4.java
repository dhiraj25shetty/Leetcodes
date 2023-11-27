import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview4 {
    //String str = "hi there";
    public static void firstNonRepeat(String str)
//    {
//        Map<Character,Integer> count=new LinkedHashMap<>();
//        for(int i=0;i<str.length();i++){
//            if(count.containsKey(str.charAt(i))){
//                count.put(str.charAt(i),count.get(str.charAt(i))+1);
//            }else{
//                count.put(str.charAt(i),1);
//            }
//        }
//        for(Map.Entry<Character,Integer> ele: count.entrySet()){
//            if(ele.getValue()==1){
//                System.out.print(ele.getKey());
//                break;
//            }
//        }
//        //System.out.print("not found");
//    }
    {
        Map.Entry<String, Long> stringLongEntry = Arrays.stream(str.split("")).collect(Collectors.
                        groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(s -> s.getValue() == 1).findFirst().get();
        System.out.print(stringLongEntry);
    }
    public static void main(String args[]){
        String str = "hihi there";
        firstNonRepeat(str.replace(" ",""));
    }
}
