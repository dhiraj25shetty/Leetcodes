//partially implemented
public class LongestPalindSS {
    public static void main(String[] args) throws Exception{
        String s="aaaa";
        LongestPalindSS ll=new LongestPalindSS();
        String maxStr=ll.longestPalindrome(s);
        System.out.println(maxStr);
    }
    public String longestPalindrome(String s) {
        String maxStr="";
        String str="";
        for(int i=0;i<s.length();i++){
            str = leftRightCheck(s.charAt(i),s,i);
            if(maxStr.length()<str.length()){
                maxStr=str;
            }
        }
        return maxStr;
    }

    public static String leftRightCheck(char c,String s,int i){
        char left= '\0';
        char right= '\0';
        String substring=String.valueOf(c);
        String maxSS=substring;

        boolean flag=false;
        int l=i;int r=i;
        int k=1;
        while(l>0 && r<s.length()-1) {
            if (i > 0) {
                left = s.charAt(l - 1);
            }
            l--;
            if (i < s.length() - 1) {
                right = s.charAt(r + 1);
            }
            r++;
            if(left==right) {
                substring = String.valueOf(left) + substring + String.valueOf(right);
                flag=true;
            }else if(c==left && k==1){
                substring = String.valueOf(left) + substring;
                if(maxSS.length() < substring.length()){
                    maxSS = substring;
                }
            }
            //reverse logic
            StringBuilder reverseStr = new StringBuilder();

            // append a string into StringBuilder input1
            reverseStr.append(substring);
            // reverse StringBuilder input1
            reverseStr.reverse();
            String reverseStrString = reverseStr.toString();
            if (reverseStrString.equals(substring) && maxSS.length() < substring.length()) {
                maxSS = substring;
            }
            k++;
        }
        if (!flag && i > 0&& l>0) {
            left = s.charAt(l - 1);
            if (c == left) {
                substring = String.valueOf(left) + substring;
                if(maxSS.length() < substring.length()){
                    maxSS = substring;
                }
            }
        }

        return maxSS;
    }

}
