package main.BubbleSort;

import util.Util;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        Arrays.stream(bubbleSort(array)).forEach(System.out::print);
    }
    public static int[] bubbleSort(int[] array){
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted){
            isSorted = true;
            for(int i = 0; i < array.length - 1 - counter; i++){
                if(array[i] > array[i + 1]){
                    Util.swap(i,i+1, array);
                    isSorted = false;
                }
            }
            counter++;
        }
        return array;
    }
}