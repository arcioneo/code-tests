package utils;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zero {

    public String getZeroes(int n) {
        return IntStream.range(0, n).mapToObj(i -> "0").collect(Collectors.joining());
    }

    public String removeZeroesToTheLeft(String value) {
        return value.replaceFirst("^[0]+", "");
    }

}
