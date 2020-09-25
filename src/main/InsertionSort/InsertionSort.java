package main.InsertionSort;

import util.Util;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        Arrays.stream(insertionSort(input)).forEach(System.out::println);
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++){
            int j = i;
            while (j > 0 && array[j] < array[j - 1]){
                Util.swap(j,j-1, array);
                j -= 1;
            }
        }
        return array;
    }
}