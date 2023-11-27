public class RemoveElemtn {
        public static int removeElement(int[] nums, int val) {
            int k=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[k]=nums[i];
                    k++;
                }else{
                    nums[i]=-1;
                }
            }
            return k;
        }

    public static void main(String[] args) {
        int num[]={3,3};
        int val=3;
        int k = removeElement(num,val);
        System.out.println("after removal: " + k);
    }
}
