package CtsJavaInterw;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRptdEleInArray {
    // How do you find the most repeated element in an array?
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen","Note Book", "Pencil");

        Map<String, Long> collect = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> stringLongEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.printf("Most Frequent Element:%s%nCount:%s%n",stringLongEntry.getKey(),stringLongEntry.getValue());
//if we have more same count repeated values
        List<String> listOfStrings2 = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Note Book", "Pencil");
        Map<String, Long> collect1 = listOfStrings2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Long max = Collections.max(collect1.values());

        List<String> collect2 = collect1.entrySet().stream().filter(entry -> entry.getValue() == max).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.printf("Most Frequent Element:%s%nCount:%d%n",collect2,max);

    }
}
