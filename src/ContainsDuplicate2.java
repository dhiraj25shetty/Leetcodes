import java.util.*;

public class ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> uniqueEleMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(uniqueEleMap.containsKey(nums[i])) {
                int j = uniqueEleMap.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
                //uniqueEleList.add(i,nums[i]);
            }
            uniqueEleMap.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        int num[]={1,0,1,1};
        int k=1;
        boolean p = containsNearbyDuplicate(num,k);
        System.out.println("contiains duplicate 2: " + p);
    }
}
