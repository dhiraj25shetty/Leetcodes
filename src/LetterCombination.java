import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {

    public static List<String> letterCombinations(String digits) {
        if(digits.equals("")) {
            return new ArrayList<>();
        }
        Map<Character,String> digitMap=new HashMap<>();
        digitMap.put('2',"abc");
        digitMap.put('3',"def");
        digitMap.put('4',"ghi");
        digitMap.put('5',"jkl");
        digitMap.put('6',"mno");
        digitMap.put('7',"pqrs");
        digitMap.put('8',"tuv");
        digitMap.put('9',"wxyz");
        List<String> arr=new ArrayList<>();

        String n=recursive(digits, digitMap, arr,"");
        return arr;
    }

    public static String recursive(String digit,Map digitMap,List<String> arr,String s){
        if(digit.equals("")){
            arr.add(s);
            return "";
        }
        String temp="";
            String word= (String) digitMap.get(digit.charAt(0));
            int k=0;
            for(int j=0;j<word.length();j++) {
                String ele=word.substring(j,j+1);
                s=s+ele;
                temp= ele+recursive(digit.substring(k + 1), digitMap, arr,s);
                String reverse="";
                String Unreverse="";
                for (int i=0; i<s.length(); i++)
                {
                    reverse= s.charAt(i)+reverse; //adds each character in front of the existing string
                }
                reverse=reverse.replaceFirst(ele,"");
                for (int i=0; i<reverse.length(); i++)
                {
                    Unreverse=reverse.charAt(i)+ Unreverse; //adds each character in front of the existing string
                }
                s=Unreverse;
            }
        return "";
    }

    public static void main(String[] args) {
        String digits = "999";
        // ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        List<String> p = letterCombinations(digits);

        System.out.println("letterCombinations: " + p);
    }
}




//for(char c:s.toCharArray()){
//                char[] sArr=s.toCharArray();
//                    for(int i=sArr.length-1;i>=0;i--) {
//                        if (sArr[i] == ele.charAt(0)) {
//                            sArr[i]='\0';
//                            break;
//                        }
//                    }
