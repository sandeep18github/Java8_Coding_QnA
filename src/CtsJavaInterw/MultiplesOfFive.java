package CtsJavaInterw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplesOfFive {
    public static void main(String[] args) {
        //7) From the given list of integers, print the numbers which are multiples of 5?

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> collect = listOfIntegers.stream().filter(p -> p % 5 == 0).collect(Collectors.toList());

        System.out.println(collect);

    }
}
