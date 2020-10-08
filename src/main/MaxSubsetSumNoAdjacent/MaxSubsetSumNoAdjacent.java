package main.MaxSubsetSumNoAdjacent;

public class MaxSubsetSumNoAdjacent {
    public static void main(String[] args) {
        int[] input = {75, 105, 120, 75, 90, 135};
        System.out.println(maxSubsetSumNoAdjacent(input));
        System.out.println(maxSubsetSumNoAdjacent2(input));
    }

    public static int maxSubsetSumNoAdjacent(int[] array) {
        if(array.length == 0) {
            return 0;
        }else if (array.length == 1){
            return array[0];
        }

        int[] maxSums = array.clone();
        maxSums[1] = Math.max(array[0],array[1]);
        for(int i = 2; i < array.length; i++){
            maxSums[i] = Math.max(maxSums[i - 1],maxSums[i-2] + array[i]);
        }
        return maxSums[maxSums.length -1];
    }

    public static int maxSubsetSumNoAdjacent2(int[] array) {
        if(array.length == 0) {
            return 0;
        }else if (array.length == 1){
            return array[0];
        }
        int second = array[0];
        int first = Math.max(array[0],array[1]);
        for(int i = 2; i < array.length; i++){
            int current = Math.max(first,second + array[i]);
            second = first;
            first = current;
        }
        return first;
    }
}