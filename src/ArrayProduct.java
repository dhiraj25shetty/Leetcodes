import java.util.Arrays;


import java.util.Arrays;
        import java.util.HashSet;
        import java.util.Set;

public class ArrayProduct {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=1;
        int[] suffix=new int[nums.length];
        suffix[nums.length-1]=1;

        for(int i=1;i<nums.length;i++){
            prefix[i] =prefix[i-1]* nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        //multiple both array ith ellement
        for(int i=0;i<nums.length;i++){
            nums[i]=prefix[i]*suffix[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        ArrayProduct ap=new ArrayProduct();
        System.out.println(Arrays.toString(ap.productExceptSelf(nums)));
    }
}
