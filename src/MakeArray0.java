import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MakeArray0 {
    public static int minimumOperations(int[] nums) {
//        Set<Integer> eleSet=new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            eleSet.add(nums[i]);
//        }
        Set<Integer> eleSet = new HashSet<>(Arrays.asList(Arrays.stream( nums ).boxed().toArray( Integer[]::new )));
        if(eleSet.contains(0)){
            eleSet.remove(0);
        }
        return eleSet.size();
    }
    public static void main(String[] args) {
        int num[]={1,5,0,3,5};
        int k = minimumOperations(num);
        System.out.println("minimumOperations: " + k);
    }
}
