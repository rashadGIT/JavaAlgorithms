package main.BinaryTree;

public class BinaryTree {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;
        System.out.println(binarySearch(array,target));
    }
    public static int binarySearch(int[] array,int target){
       return binarySearchHelperLoop(array,target, 0 , array.length -1);
    }

    public static int binarySearchHelperLoop(int[] array,int target, int left, int right){
        while(left <= right){
            int middle =(int) Math.floor((left + right) >> 1);
            int potentialMatch = array[middle];
            if(target == potentialMatch){
                return middle;
            }
            else if (target < potentialMatch){
                right = middle - 1;
            }
            else{
                left = middle + 1;
            }
        }
        return -1;
    }


    public static int binarySearchHelperRecursive(int[] array,int target, int left, int right){
        if(left > right) return -1;
        int middle =(int) Math.floor((left + right) >> 1);
        int potentialMatch = array[middle];
        if(target == potentialMatch){
            return middle;
        }else if(target < potentialMatch){
            return binarySearchHelperRecursive(array,target,left,middle - 1);
        }
        else {
            return binarySearchHelperRecursive(array,target,middle + 1,right);
        }
    }
}