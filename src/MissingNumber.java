import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int length=nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int arr[]={0,1};
        int p = missingNumber(arr);

        System.out.println("missingNumber: " + p);
    }
}
