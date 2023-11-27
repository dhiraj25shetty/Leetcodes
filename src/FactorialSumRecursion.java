import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FactorialSumRecursion {

    // Recursive function to calculate the factorial of a number

    public static int factorial(int num,Map processedItem) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            if(processedItem.containsKey(num)){
                return (int) processedItem.get(num);
            }else{
                return num * factorial(num - 1,processedItem);
            }
        }
    }

    // Recursive function to calculate the sum of factorials of array elements
    public static int factorialSum(int[] arr, int index,Map processedItem) {
        int sumOfFactorial=0;
        for(int i=0;i<arr.length;i++) {
            int currentFactorial = factorial(arr[i], processedItem);
            processedItem.put(arr[i], currentFactorial);
            sumOfFactorial=sumOfFactorial+currentFactorial;
        }
        return sumOfFactorial;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 4 };//2345
        Arrays.sort(arr);
        Map<Integer,Integer> processedItem=new HashMap<>();
        int sumOfFactorials = factorialSum(arr, 0,processedItem);
        System.out.println("Sum of factorials of elements in the array: " + sumOfFactorials);
    }
}
