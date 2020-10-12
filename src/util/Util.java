package util;

import java.util.List;

public class Util {

    public static void swap(int current, int next, int[] array){
        int temp = array[current];
        array[current] = array[next];
        array[next] = temp;
    }

    public static void swap(int current, int next, List<Integer> array){
        int temp = array.get(current);
        array.set(current,array.get(next));
        array.set(next,temp);
    }

    public static boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean compare(List<String> arr1, String[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (!arr1.get(i).equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}