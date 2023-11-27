import java.util.Arrays;

public class MinAddABC {
    public static int addMinimum(String word) {
        String compare="abc";
        String newString="";
        char[] wordArr = word.toCharArray();
        int k=0;
        String superNewString="";
        int totalCount=0;
        for(int i=0;i<wordArr.length;i++){
            int counter = checkLeftRight(wordArr[i],word,i);
            totalCount=counter+totalCount;
            //superNewString=superNewString+returned;
            System.out.println(counter);
        }
        return totalCount;
    }
    public static int checkLeftRight(char curr,String word,int indx) {
        String newString = "";
        int counter=-0;
        boolean flag=false;
        if (curr == 'b') {
            if((indx-1)>=0) {
            if (word.charAt(indx - 1) != 'a') {
                newString = newString + word.substring(0, indx) + 'a' + curr;
                counter++;
            }
            }else{
                newString = newString +  'a'+curr;
                counter++;
            }
            if((indx+1)<word.length()) {
                if (word.charAt(indx + 1) != 'c') {
                    newString = newString + word.substring(0, indx) + curr + 'c';
                    counter++;
                }
            }else{
                newString = newString +'c';
                counter++;
            }
        } else if (curr == 'a') {
            if((indx+1)<word.length()) {
                if (word.charAt(indx + 1) != 'b') {
                    newString = newString + curr + 'b';
                    flag=true;
                    counter++;
                }//else if((indx+2)<word.length() && word.charAt(indx + 2) != 'c' ){
//                    counter++;
//                }
            }else{
                newString = newString + curr + 'b';
                flag=true;
                counter++;
            }
            if((indx+2)<word.length()) {
                if (word.charAt(indx + 2) != 'c'){
                    newString = newString + 'c';
                    flag=true;
                    counter++;
                }
            }else{
                newString = newString + 'c';
                flag=true;
                counter++;
            }
        } else {
            if((indx-1)>=0) {
                if (word.charAt(indx - 1) != 'b') {
                    newString = newString  + 'b' + curr;
                    counter++;
                }
            }else{
                newString = newString+'b'+curr;
                counter++;
            }
            if((indx-2)>=0) {
                if (word.charAt(indx - 2) != 'a') {
                    newString = newString  + 'a' + curr;
                    counter++;
                }
            }else{
                newString = 'a'+newString;
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String word="aab";      //aaaaab
        int min=addMinimum(word);
        System.out.println(min);
    }
}
