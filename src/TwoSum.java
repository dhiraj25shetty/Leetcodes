import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> keyIndxMap=new HashMap<>();
        int[] indices2Sum=new int[2];
        int currentVal=0;
        for(int firstIndex=0;firstIndex<nums.length;firstIndex++){
            currentVal=nums[firstIndex];
            if(keyIndxMap.containsKey(target-currentVal)){
                indices2Sum[0]=firstIndex;
                indices2Sum[1]=keyIndxMap.get(target-currentVal);
                break;
            }else{
                keyIndxMap.put(currentVal,firstIndex);
            }
        }
        return indices2Sum;
    }

    public static void main(String[] args) {
        int num[]={3,3};
        int target=6;
        int[] p = twoSum(num,target);
        for(int i=0;i<p.length;i++)    //length is the property of the array
            System.out.println("2sum: " + p[i]);
    }
}
