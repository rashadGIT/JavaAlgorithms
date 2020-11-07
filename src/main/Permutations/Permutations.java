package main.Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static util.Util.swap;

public class Permutations {
    public static void main (String[] args){
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(getPermutations(input));
        List<Integer> input2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(getPermutationsSwap(input2));
    }

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(array, new ArrayList<>(), permutations);
        return permutations;
    }
    public static void getPermutations(List<Integer> array, List<Integer> currentPermutation, List<List<Integer>> permutations){
        if (array.size() == 0 && currentPermutation.size() > 0){
            permutations.add(currentPermutation);
        }else{
            for(int i = 0; i < array.size(); i++){
                List<Integer> newArray = new ArrayList<>(array);
                //noinspection SuspiciousListRemoveInLoop
                newArray.remove(i);
                List<Integer> newPermutation = new ArrayList<> (currentPermutation);
                newPermutation.add(array.get(i));
                getPermutations(newArray, newPermutation, permutations);
            }
        }
    }

    public static List<List<Integer>> getPermutationsSwap(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(0, array, permutations);
        return permutations;
    }
    public static void getPermutations(int i, List<Integer> array, List<List<Integer>> permutations){
        if (i == array.size() - 1){
            permutations.add(new ArrayList<>(array));
        }else{
            for(int j = i; j < array.size(); j++){
                swap(i, j, array);
                getPermutations(i+1,array,permutations);
                swap(i, j, array);
            }
        }
    }
}
