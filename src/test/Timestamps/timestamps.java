package test.Timestamps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class timestamps {

    public static void main(String[] args) {
        List<Integer> timestamps = Arrays.asList(1,2,3,5,3,6,5,6,7,2,13,16);
        List<Integer> top = Arrays.asList(10,15);

       System.out.println(getNumPerInterval(timestamps,top));

    }

    private static int getNumPerInterval(List<Integer> timestamps, List<Integer> top){
        return IntStream.range(0, top.size())
                .mapToObj((int i) -> timestamps.stream()
                        .filter(time -> {
                            if (i == 0) return time < top.get(i);
                            return time > top.get(i - 1) && time < top.get(i);
                        })
                        .collect(Collectors.toList()))
                .map(List::size)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
