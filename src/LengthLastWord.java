public class LengthLastWord {
    public static int lengthOfLastWord(String s) {
        int k=0;
        boolean isCharacterEncountered=false;
        for(int i=s.length()-1;i>=0;i--){
            if(!Character.isWhitespace(s.charAt(i)) &&  !Character.isDigit(s.charAt(i))){
                k++;
                isCharacterEncountered=true;
            }else if(isCharacterEncountered){
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        String s="luffy is still joyboy";
        int k = lengthOfLastWord(s);
        System.out.println("after removal: " + k);
    }
}
