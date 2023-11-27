public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        //Set<Integer>
        int k=0;
        for(int i=0;i<nums.length;i++){

            if(i <nums.length-1 && nums[i]!=nums[i+1]){
                nums[k]=nums[i];
                k++;
            }else if (i >=nums.length-1){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int num[]={1,1,2};
        int k = removeDuplicates(num);
        System.out.println("after removal: " + k);
    }

}
