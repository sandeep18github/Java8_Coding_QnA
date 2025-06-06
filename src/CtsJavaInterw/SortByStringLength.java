package CtsJavaInterw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByStringLength {
    public static void main(String[] args) {
        //15) Given a list of strings, sort them according to increasing order of their length?
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        List<String> collect = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());

        System.out.println(collect);
//15) Given a list of strings, sort them.
        List<String> collect1 = listOfStrings.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);

    }
}
