import java.util.*;
import java.util.stream.Collectors;

public class StreamSalary {


    public static void main(String args[]){
        Map<String,Integer> empSal=new HashMap<>();
        empSal.put("ashok",1000);
        empSal.put("mahesh",1000);
        empSal.put("kishan",3000);
        empSal.put("akshay",500);
        empSal.put("raunak",1000);
        empSal.put("zuber",3000);

        Map.Entry<Integer, List<String>> integerListEntry = empSal.entrySet().stream().
                collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().
                sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList())
                .get(1);
        System.out.println("result>>"+integerListEntry);
    }
}
