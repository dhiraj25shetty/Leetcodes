public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] twoDArray = new int[text1.length()+1][text2.length()+1];
        //int count=0;

        for(int i=1;i<text1.length()+1;i++){
            for(int j=1;j<text2.length()+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    twoDArray[i][j] = twoDArray[i-1][j-1]+1;
                    //count++;
                }else{
                    twoDArray[i][j]=Math.max(twoDArray[i][j-1],twoDArray[i-1][j]);
                }
            }
        }
        //printing
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        return twoDArray[text1.length()][text2.length()];
    }
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int p = longestCommonSubsequence(text1, text2);

        System.out.println("longestCommonSubsequence: " + p);
    }
}
