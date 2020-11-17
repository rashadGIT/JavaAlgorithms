package main.RiverSizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RiverSizes {

    public static void main(String[] args) {
        int[][] input = {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0},
        };
        System.out.println(riverSizes(input));
    }

    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> sizes = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(visited[i][j]){
                    continue;
                }
                traverseNode(i, j, matrix, visited, sizes);
            }
        }
        return sizes;
    }
    public static void traverseNode (int i, int j, int[][] matrix, boolean[][] visited, List<Integer> sizes){
        int currentRiverSize = 0;
        Stack<Integer[]> nodesToExplore = new Stack<>();
        nodesToExplore.push(new Integer[]{ i, j });
        while(!nodesToExplore.empty()) {
            Integer[] currentNode = nodesToExplore.pop();
            i = currentNode[0];
            j = currentNode[1];
            if (visited[i][j]) {
                continue;
            }
            visited[i][j] = true;
            if (matrix[i][j] == 0) {
                continue;
            }
            currentRiverSize++;
            List<Integer[]> unvisitedNeighbors = getUnvisitedNeighbors(i, j, matrix, visited);
            nodesToExplore.addAll(unvisitedNeighbors);
        }
        if(currentRiverSize > 0){
            sizes.add(currentRiverSize);
        }
    }



    public static List<Integer[]> getUnvisitedNeighbors(int i, int j, int[][] matrix, boolean[][] visited){
        List<Integer[]> unVisitedNeighbors = new ArrayList<>();
        if(i > 0 && !visited[i - 1][j]){
            unVisitedNeighbors.add(new Integer[] {i - 1, j});
        }
        if(i < matrix.length - 1 && !visited[i + 1][j]){
            unVisitedNeighbors.add(new Integer[] {i + 1, j});
        }
        if(j > 0 && !visited[i][j - 1]){
            unVisitedNeighbors.add(new Integer[] {i, j - 1});
        }

        if(j < matrix[0].length - 1 && !visited[i][j + 1]){
            unVisitedNeighbors.add(new Integer[] {i, j + 1});
        }
        return unVisitedNeighbors;
    }
}
