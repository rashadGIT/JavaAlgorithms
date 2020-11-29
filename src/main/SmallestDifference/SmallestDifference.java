package main.SmallestDifference;

import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args) {
        Arrays.stream(smallestDifference(new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17})).forEach(System.out::println);
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne= 0, idxTwo = 0, current, smallest = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];
        while (idxOne < arrayOne.length && idxTwo < arrayTwo.length){
            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];
            current = Math.abs(firstNum - secondNum);
            if(firstNum < secondNum){
                idxOne++;
            }else if(firstNum > secondNum){
                idxTwo++;
            }else {
                return new int[] {firstNum, secondNum};
            }
            if(smallest > current){
                smallest = current;
                smallestPair = new int[]{firstNum, secondNum};
            }
        }
        return smallestPair;
    }
}