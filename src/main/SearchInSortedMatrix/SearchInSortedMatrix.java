package main.SearchInSortedMatrix;

public class SearchInSortedMatrix {
    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y < matrix[x].length; y++){
                if(matrix[x][y] == target){
                    return new int[] {x , y};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
