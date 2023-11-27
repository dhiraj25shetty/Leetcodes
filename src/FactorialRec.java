public class FactorialRec {
    //6*5*4*3*2*1
    public static int calcFact(int n){
        if(n==1){
            return 1;
        }
        int sum=n * calcFact(n-1);
        return sum;
    }

    public static void main(String args[]){
        int n=5;
        int sum=calcFact(n);
        System.out.print(sum);
    }
}
