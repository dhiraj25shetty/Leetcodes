public class MaxSubArray {
    public static double findMaxAverage(int[] nums, int k) {
        double avg=0.0;
        double maxAvg = 0.0;
        long sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        avg= (double) sum /k;
        maxAvg=avg;
        int j=0;
        for(int i=1;i<nums.length;i=i+k){
            if(i+k<=nums.length) {
                sum = sum - nums[i - 1] + nums[j+k];
                avg= (double) sum /k;
                if(avg>maxAvg){
                    maxAvg = avg;
                }
                j++;
            }else{
                break;
            }
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        int[] nums={7,4,5,8,8,3,9,8,7,6};
        int k=7;
        System.out.println(findMaxAverage(nums,k));
    }
}
