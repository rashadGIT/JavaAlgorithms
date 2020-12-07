package main.SpiralTraverse;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static void main(String[] args) {
        int[][] input = new int[][] {
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7}
        };
        System.out.println(spiralTraverse(input));
        System.out.println(spiralTraverse(input));
    }

    public static List<Integer> spiralTraverse(int[][] array) {
        if(array.length == 0) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endRow = array.length - 1;
        int startColumn = 0;
        int endColumn = array[0].length- 1;

        while(startRow <= endRow && startColumn <= endColumn){
            for (int col = startColumn; col <= endColumn; col++){
                result.add(array[startRow][col]);
            }

            for(int row = startRow + 1; row <= endRow; row++){
                result.add(array[row][endColumn]);
            }

            for(int col = endColumn -1 ; col >= startColumn; col--){
                if(startRow == endRow)break;
                result.add(array[endRow][col]);
            }
            for(int row = endRow - 1; row > startRow; row--){
                if(startColumn == endColumn) break;
                result.add(array[row][startColumn]);
            }
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
        return result;
    }

    public static List<Integer> spiralTraverseRecursive(int[][] array) {
        List<Integer> result = new ArrayList<>();
        if(array.length == 0) return result;
        spiralFill(array,0, array.length - 1, 0, array[0].length- 1, result);
        return result;
    }
    public static void spiralFill(int[][] array, int startRow, int endRow,int startColumn, int endColumn, List<Integer> result){
        if(startRow > endRow || startColumn > endColumn){
            return;
        }

        for(int col = startColumn; col <= endColumn; col++){
            result.add(array[startRow][col]);
        }

        for(int row = startRow + 1; row <= endRow; row++){
            result.add(array[row][endColumn]);
        }

        for(int col = endColumn -1 ; col >= startColumn; col--){
            if(startRow == endRow)break;
            result.add(array[endRow][col]);
        }

        for(int row = endRow - 1; row >= startRow + 1; row--){
            if(startColumn == endColumn) break;
            result.add(array[row][startColumn]);
        }
        spiralFill(array,startRow + 1,endRow -1 ,startColumn + 1,endColumn - 1,result);
    }
}