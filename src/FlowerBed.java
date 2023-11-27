public class FlowerBed {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if(i==0){
                if(flowerbed[i]==0 && i+1<flowerbed.length ){
                    if(flowerbed[i+1]!=1){
                        n--;
                        flowerbed[i]=1;
                    }
                }else if(flowerbed[i]==0){
                    n--;
                    flowerbed[i]=1;
                }
            }else if(i==flowerbed.length-1){
                if(flowerbed[i]==0 && flowerbed[i-1]==0){
                    n--;
                    flowerbed[i]=1;
                }
            }else{
                if(flowerbed[i]==0 && flowerbed[i-1]==0 && i+1<flowerbed.length && flowerbed[i+1]==0){
                    n--;
                    flowerbed[i]=1;
                }
            }
        }
        return n == 0;
    }
    public static void main(String[] args) {
        int[] flowerbed = {0,1,0};
        int n =1;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}
