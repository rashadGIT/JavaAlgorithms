package main.FindString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindString {

    public static void main(String[] args) {

        List<String> a = Arrays.asList("Hello", "World");
        List<String> b = Arrays.asList("hi", "Rashad");

        stringArray(a,b).forEach(x -> System.out.println(x ? "Yes" : "No"));
    }

    public static List<Boolean> stringArray(List<String> a, List<String> b){
      return IntStream.range(0, a.size())
                .mapToObj(i -> a.get(i).chars().mapToObj(l -> (char) l).anyMatch(letter -> b.get(i).contains(Character.toString(letter))))
                .collect(Collectors.toList());
    }
}
