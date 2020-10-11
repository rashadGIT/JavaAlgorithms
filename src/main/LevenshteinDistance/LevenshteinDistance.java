package main.LevenshteinDistance;

import java.util.Comparator;
import java.util.stream.Stream;

public class LevenshteinDistance {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "Hello";
        System.out.println(levenshteinDistance(str1, str2));
        System.out.println(levenshteinDistanceComplex(str1, str2));
    }

    public static int levenshteinDistance(String str1, String str2) {
        int[][] edits = new int[str2.length() + 1][str1.length() + 1];
        for(int i = 0; i < str2.length() + 1; i++){
            for(int j = 0; j < str1.length() + 1; j++){
                edits[i][j] = j;
            }
            edits[i][0] = i;
        }

        for(int i = 1; i < str2.length() + 1; i++){
            for(int j = 1; j < str1.length() + 1; j++){
                if(str2.charAt(i -1) == str1.charAt(j -1)){
                    edits[i][j] = edits[i - 1][j - 1];
                }
                else{
                    int min = Stream.of(edits[i - 1][j - 1], edits[i - 1][j], edits[i][j - 1])
                            .min(Comparator.comparing(Integer::valueOf))
                            .get();
                    edits[i][j] = 1 + min;
                }
            }
        }
        return edits[str2.length()][str1.length()];
    }

    public static int levenshteinDistanceComplex(String str1, String str2) {
        String small = str1.length() < str2.length() ? str1 : str2;
        String big = str1.length() >= str2.length() ? str1 : str2;
        int[] evenEdits = new int[small.length() + 1];
        int[] oddEdits = new int[small.length() + 1];
        for(int j = 0; j < small.length() + 1; j++){
            evenEdits[j] = j;
        }

        int[] currentEdits;
        int[] previousEdits;
        for(int i = 1; i < big.length() + 1; i++){
            if (i % 2 == 1){
                currentEdits = oddEdits;
                previousEdits = evenEdits;
            }else{
                currentEdits = evenEdits;
                previousEdits = oddEdits;
            }
            currentEdits[0] = i;
            for(int j = 1; j < small.length() + 1; j++){
                if(big.charAt(i - 1) == small.charAt(j - 1)){
                    currentEdits[j] = previousEdits[j - 1];
                }
                else{
                    int min = Stream.of(previousEdits[j - 1], previousEdits[j], currentEdits[j - 1])
                            .min(Comparator.comparing(Integer::valueOf))
                            .get();
                    currentEdits[j] = 1 + min;
                }
            }
        }
        return big.length() % 2 == 0 ? evenEdits[small.length()] : oddEdits[small.length()];
    }

}