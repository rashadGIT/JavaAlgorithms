package main.PowerSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        List<List<Integer>> output = powerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        List<List<Integer>> outputRecursive = powerSetRecursive(new ArrayList<>(Arrays.asList(1, 2, 3)));
        System.out.println(output);
        System.out.println(outputRecursive);
    }
    public static List<List<Integer>> powerSet(List<Integer> array) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(int num : array){
            int length =  subsets.size();
            for(int i = 0; i < length; i++){
                List<Integer> currentSubset = new ArrayList<>(subsets.get(i));
                currentSubset.add(num);
                subsets.add(currentSubset);
            }
        }
        return subsets;
    }

    public static List<List<Integer>> powerSetRecursive(List<Integer> array) {
        return helper(array, array.size() -1);
    }

    private static List<List<Integer>> helper(List<Integer> array, int idx){
        if(idx < 0){
            List<List<Integer>> empty = new ArrayList<>();
            empty.add(new ArrayList<>());
            return empty;
        }
        int element = array.get(idx);
        List<List<Integer>> subsets = helper(array, idx - 1);
        int length = subsets.size();
        for(int i = 0; i < length; i++){
            List<Integer> currentSubset = new ArrayList<>(subsets.get(i));
            currentSubset.add(element);
            subsets.add(currentSubset);
        }
        return subsets;
    }

}