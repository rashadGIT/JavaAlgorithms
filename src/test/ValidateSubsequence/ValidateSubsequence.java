package test.ValidateSubsequence;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        List<Integer>  array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        System.out.println(isValidSubsequenceIterator(array,sequence));

    }
    private static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0;
        int seqIdx = 0;
        while(arrIdx < array.size() && seqIdx < sequence.size()){
            if(array.get(arrIdx).equals(sequence.get(seqIdx))){
                seqIdx++;
            }
            arrIdx++;
        }
        return seqIdx == sequence.size();
    }

    private static boolean isValidSubsequenceForLoop(List<Integer> array, List<Integer> sequence) {
        int seqIdx = 0;
        for (Integer anArray : array) {
            if (seqIdx == sequence.size()) return true;
            if (anArray.equals(sequence.get(seqIdx))) {
                seqIdx++;
            }
        }
        return seqIdx == sequence.size();
    }

    private static boolean isValidSubsequenceIterator(List<Integer> array, List<Integer> sequence){
        AtomicInteger seqIdx = new AtomicInteger();
        IntStream.range(0, array.size())
                .forEach((int i) -> {
                    if (seqIdx.get() == sequence.size()) {
                        return;
                    }
                    if (array.get(i).equals(sequence.get(seqIdx.get()))) {
                        seqIdx.getAndIncrement();
                    }
                });
        return seqIdx.get() == sequence.size();
    }
}