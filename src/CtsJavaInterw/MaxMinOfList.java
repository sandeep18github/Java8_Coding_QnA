package CtsJavaInterw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxMinOfList {
    public static void main(String[] args) {

        //8) Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> collect = listOfIntegers.stream().sorted().collect(Collectors.toList());

        //Approch -1
        listOfIntegers.stream().sorted().limit(1).forEach(System.out::println);
        listOfIntegers.stream().sorted().skip(listOfIntegers.size() - 1).forEach(System.out::println);

        //Approch -2
        Integer maxNum = listOfIntegers.stream().max(Comparator.naturalOrder()).get();

        Integer minNum = listOfIntegers.stream().min(Comparator.naturalOrder()).get();




        System.out.println("Max Num --> " + maxNum + " Min Num --> " + minNum + " SortedList --> " + collect);
    }
}
