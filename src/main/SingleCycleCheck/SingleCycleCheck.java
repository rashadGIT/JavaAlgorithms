package main.SingleCycleCheck;

public class SingleCycleCheck {

    public static void main(String[] args) {
        System.out.println(hasSingleCycle(new int[] {2, 3, 1, -4, -4, 2}));
    }

    public static boolean hasSingleCycle(int[] array) {
        int numElementsVisted = 0;
        int currentIdx = 0;
        while(numElementsVisted < array.length){
            if(numElementsVisted > 0 && currentIdx == 0){
                return false;
            }
            numElementsVisted++;
            currentIdx = getNextIdx(currentIdx,array);
        }
        return currentIdx == 0;
    }
    public static int getNextIdx(int currentIdx, int[] array){
        int jump = array[currentIdx];
        int nextIdx = (currentIdx + jump) % array.length;
        return nextIdx >= 0 ? nextIdx : nextIdx + array.length;
    }

}
