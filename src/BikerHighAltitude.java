public class BikerHighAltitude {
    public static int largestAltitude(int[] gain) {
        int highAltitude=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
           sum=sum+gain[i];
           if(sum>highAltitude)
               highAltitude=sum;
        }
        return highAltitude;
    }
    public static void main(String[] args) {
       int[] gain={-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(gain));
    }
}
