import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Ineerivew {
        public static void main(String[] args) {

            System.out.println("Welcome to Online IDE!! Happy Coding :)");
            String str="interpreter";
            Map<String, Long> charCount= Arrays.stream(str.split("")).collect(
                    Collectors.groupingBy(Function.identity(),counting()));

            Arrays.stream(str.split("")).distinct().forEach(System.out::print);
            //.entrySet().filter(s);
           /* for(Map.Entry<String, Long> ele:charCount.entrySet()){
                if(ele.getValue()==1){
                    System.out.print(ele.getKey());
                }
            }*/
        }
    }
