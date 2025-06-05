package CtsJavaInterw;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharcterFrequency {
    public static void main(String[] args) {
        //3) How do you find frequency of each character in a string using Java 8 streams?
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> collect = inputString.replaceAll("\\s+", "").toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

       // collect.forEach((a, b) -> System.out.println(a + " ---> " + b));

        System.out.println(collect);
//================================Approach 2 without replaceall==========================================================
       Map<Character,Long> unique = inputString.toLowerCase().chars().mapToObj(c->(char)c).filter(Character::isLetter).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(unique);
       // unique.forEach((a, b) -> System.out.println(a + " ---> " + b));
    }
}