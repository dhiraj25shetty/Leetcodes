public class Fibo {
    //n=5  0 1 1 2 3   n=3 0 1 1

    public static int calcFibo(int n,int ele){

        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        for(int i=0 ;i<n;i++){
             ele=calcFibo(i,ele) + calcFibo(i+1,ele);//n=3  0+1 1+
        }
        return ele;

    }

    public static void main(String args[]){
        int n=3;
        int ele=0;
        int sum=calcFibo(n,ele);
        System.out.print(sum);
    }
}
