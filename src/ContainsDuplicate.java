import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        boolean isDuplicate=false;
        Set<Integer> eleSet=new HashSet<>();
        OptionalInt ele=Arrays.stream(nums).filter(s->!eleSet.add(s)).findFirst();
        if(ele.isPresent()){
            isDuplicate=true;
        }
        return isDuplicate;
    }

    public static void main(String[] args) {
        int num[]={1,2,3};
        boolean k = containsDuplicate(num);
        System.out.println("contains Duplicate: " + k);
    }
}
