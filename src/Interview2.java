//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//public class Interview2 {
//
////    public static boolean isAnagram(String st1,String st2){
////        if(st1.length()!=st2.length()){
////            return false;
////        }
////        Set<Character> elemtnsSet=new HashSet<>();
////        for(int i=0;i<st1.length();i++){
////            elemtnsSet.add(st1.charAt(i));
////        }
////        for(int i=0;i<st2.length();i++){
////            if(!elemtnsSet.contains(st2.charAt(i))){
////                return false;
////            }
////        }
////        return true;
////    }
//
//    public static boolean isAnagram(String st1,String st2){
//        if(st1.length()!=st2.length()){
//            return false;
//        }
//        Map<Character,Integer> elemtnsMap=new HashMap<>();
//        for(int i=0;i<st1.length();i++){
//            if(elemtnsMap.containsKey(st1.charAt(i))){
//                elemtnsMap.put(st1.charAt(i),elemtnsMap.get(st1.charAt(i))+1);
//            }else{
//                elemtnsMap.put(st1.charAt(i),1);
//            }
//        }
//        for(int i=0;i<st2.length();i++){
//            if(elemtnsMap.containsKey(st2.charAt(i)) && elemtnsMap.get(st2.charAt(i))!=0){
//                elemtnsMap.put(st2.charAt(i),elemtnsMap.get(st2.charAt(i))-1);
//            }
//        }
//        return true;
//    }
//
//    public static void main(String args[]){
//        String st1="abb";{a:0,b:2}
//        String st2="aab";
//        boolean flag=isAnagram(st1,st2);
//        System.out.println("result>>"+flag);
//    }
//}
