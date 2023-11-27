public class Interview {
    public static void anticlockWise(String str,int r){
        //"am azon";
        //Output: "azonam"
        int k=0;
        int kk=r;
        if(str.length()<r){
            k=r-str.length();
            kk=k%str.length();
        }
            String newString = str.substring(kk) + str.substring(0, kk);
            System.out.print(newString);
        }
//        String newString="";
//
//        for(int i=0;i<str.length();i++){
//            newString=newString+str.charAt(i);
//            r--;
//        }
    //}

    public static void main(String args[]){
        String string = "amazon"; //namazo onamaz zonama namazo
        int r=6;
        anticlockWise(string,r);
    }

}
