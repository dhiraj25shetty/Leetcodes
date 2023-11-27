public class MinTimeTOWord {
    public static int minTimeToType(String word) {
        char currPtr='a';
        int min=0;
        int diff=0;
        for(int i=0;i<word.length();i++){
            diff =Math.abs(currPtr-word.charAt(i));
            min =min+Math.min(diff,26-diff)+1;          //to subtract clockwise and anticlockwise
            currPtr=word.charAt(i);
        }
        return min;
    }
    public static void main(String[] args) {
        String word="zbc";
        int k = minTimeToType(word);
        System.out.println("min time to type: " + k);
    }
}
