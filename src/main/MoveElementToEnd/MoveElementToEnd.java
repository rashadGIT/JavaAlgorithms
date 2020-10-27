package main.MoveElementToEnd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import util.Util;

public class MoveElementToEnd {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
        int toMove = 2;
        System.out.println(moveElementToEnd(array,toMove));
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j){
            while(i < j && array.get(j) == toMove) {
                j--;
            }
            if(array.get(i) == toMove){
                Util.swap(i,j,array);
            }
            i++;
        }
        return array;
    }

}