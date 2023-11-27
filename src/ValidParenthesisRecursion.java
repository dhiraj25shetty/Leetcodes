public class ValidParenthesisRecursion {
    //n=2 ()(),(()).    n=3 ()()(),((())),(())(),()(()),(()())
    public static void validParenthesis(int n,char arr[],int i,int o,int c){
        if(i==arr.length){
            System.out.println(arr);
        }
        if(o<n){
            arr[i]='(';
            validParenthesis(n,arr,i+1,o+1,c);
        }
        if(c<o){
            arr[i]=')';
            validParenthesis(n,arr,i+1,o,c+1);
        }

    }

    public static void main(String args[]){
        int n=4;
        char arr[]=new char[n*2];
        int o=0;int c=0;int i=0;
        validParenthesis(n,arr,i,o,c);
    }
}
