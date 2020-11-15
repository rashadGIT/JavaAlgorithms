package main.ProductSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {
    /*
    * You are given coins of different denominations and a
    * total amount of money amount. Write a function to compute
    * the fewest number of coins that you need to make up that
    * amount. If that amount of money cannot be made up by
    * any combination of the coins, return -1.
    * */
    public static void main(String[] args) {
        List<Object> array = new ArrayList<>(Arrays.asList(5, 2, new ArrayList<Object>(Arrays.asList(7, -1)), 3, new ArrayList<Object>(Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
        System.out.println(productSum(array));
    }

    public static int productSum(List<Object> array) {
        return productSumHelper(array,1);
    }

    private static int productSumHelper(List<Object> array,int multiplier){
        int sum = 0;
        for(Object obj : array){
            if(obj instanceof List){
                sum += productSumHelper((ArrayList<Object>) obj, multiplier + 1);
            }else{
                sum += (int) obj;
            }
        }
        return sum * multiplier;
    }
}
