package CtsJavaInterw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        //2) How do you remove duplicate elements from a list using Java 8 streams?
        List<String> list =Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> collect = list.stream().distinct().collect(Collectors.toList());

        System.out.println(collect);
    }
}
