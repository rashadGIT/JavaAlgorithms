package main.SelectionSort;

import util.Util;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        Arrays.stream(selectionSort(input)).forEach(System.out::println);
    }

    public static int[] selectionSort(int[] array) {
        int currIdx = 0;
        while (currIdx < array.length - 1){
            int smallestIdx = currIdx;
            for(int i = currIdx + 1; i < array.length; i++){
                if(array[smallestIdx] > array[i]){
                    smallestIdx = i;
                }
            }
            Util.swap(currIdx, smallestIdx, array);
            currIdx++;
        }
        return array;
    }
}