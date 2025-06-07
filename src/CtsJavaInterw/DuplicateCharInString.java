package CtsJavaInterw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharInString {
    public static void main(String[] args) {

        //26) Print duplicate characters in a string?
        String inputString = "Java Concept Of The Day".replaceAll("\\s+","").toLowerCase();
         Set<String> unique = new HashSet<>();

        Set<String> collect = Arrays.stream(inputString.split("")).filter(ch -> !unique.add(ch)).collect(Collectors.toSet());

        System.out.println(collect);
    }
}
