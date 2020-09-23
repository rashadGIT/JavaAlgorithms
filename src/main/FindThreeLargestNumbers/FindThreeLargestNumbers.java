package main.FindThreeLargestNumbers;

import java.util.Arrays;

public class FindThreeLargestNumbers {
    public static void main(String[] args) {
        int[] array = new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        Arrays.stream(findThreeLargestNumbers(array)).forEach(System.out::println);
    }

    public static int[] findThreeLargestNumbers(int[] array){
        int[] threeLargest = new int[3];
        for(int num : array){
           updateLargest(threeLargest, num);
        }
        return threeLargest;
    }

    public static void updateLargest(int[] threeLargest, int num){
        if(threeLargest[2] == 0  || num > threeLargest[2]){
            shiftAnuUpdate(threeLargest,num,2);
        }
        else if(threeLargest[1] == 0  || num > threeLargest[1]){
            shiftAnuUpdate(threeLargest,num,1);
        }
        else if(threeLargest[0] == 0  || num > threeLargest[0]){
            shiftAnuUpdate(threeLargest,num,0);
        }
    }

    public static void shiftAnuUpdate(int [] array, int num, int idx){
        for(int i = 0; i < idx + 1; i++){
            if(i == idx){
                array[i] = num;
            }
            else{
                array[i] = array[i + 1];
            }
        }
    }

}