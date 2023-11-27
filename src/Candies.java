import java.util.ArrayList;
import java.util.List;

public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> flagList=new ArrayList<>();
        int kidWithMax = candies[0];
        for (int i = 1; i < candies.length; i++) {
            kidWithMax = Math.max(kidWithMax, candies[i]);
        }
        for (int candy : candies) {
            if (candy + extraCandies >= kidWithMax) {
                flagList.add(true);
            } else {
                flagList.add(false);
            }
        }
        return flagList;
    }
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        Candies mx=new Candies();
        System.out.println(mx.kidsWithCandies(candies,extraCandies));
    }
}
