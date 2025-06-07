package CtsJavaInterw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        //25) How do you extract duplicate elements from an array?

        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> seen = new HashSet<>();

        Set<Integer> collect = listOfIntegers.stream().filter(i -> !seen.add(i)).distinct().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
