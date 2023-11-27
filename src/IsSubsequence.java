public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int k=0;
        for(int i=0;i<t.length() && k<s.length();i++){
            if(t.charAt(i)==s.charAt(k)){
                k++;
            }
        }

        return k==s.length();
    }
    public static void main(String[] args) {
        String s="";//acb
        String t="abc";
        System.out.println(isSubsequence(s,t));
    }
}
