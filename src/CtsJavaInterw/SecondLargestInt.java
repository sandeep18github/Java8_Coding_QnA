package CtsJavaInterw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargestInt {
    public static void main(String[] args) {
        //14) Find second largest number in an integer array?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList()).forEach(System.out::println);

        //Approach 2

       listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);




    }
}
