package main.MonotonicArray;

public class MonotonicArray {
    public static void main(String[] args) {
        int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        System.out.println(isMonotonic2(array));
    }
    public static boolean isMonotonic(int[] array) {
        if(array.length <= 2) {
            return true;
        }
        int direction = array[1] - array[0];
        for(int i = 2; i < array.length; i++){
            if(direction == 0) {
                direction = array[i] - array[i - 1];
                continue;
            }
            if (breaksDirection(direction, array[i - 1], array[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMonotonic2(int[] array) {
        boolean isNotGoingDown = true;
        boolean isNotGoingUp = true;
        for(int i = 1; i < array.length; i++){
            if(array[i] <  array[i - 1]){
                isNotGoingDown = false;
            }
            if(array[i] >  array[i - 1]){
                isNotGoingUp = false;
            }
        }
        return isNotGoingDown || isNotGoingUp;
    }

    private static boolean breaksDirection (int direction, int n1, int n2){
        int diff = n2 - n1;
        if(direction > 0){
            return diff < 0;
        }
        return diff > 0;
    }

}