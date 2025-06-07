package CtsJavaInterw;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstOccurance {
    public static void main(String[] args) {
        //27) Find first repeated character in a string?
        String inputString = "Java Concept Of The Day".replaceAll("\\s+","").toLowerCase();

        Map<String, Long> collect = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        String string = collect.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).findFirst().get();
        System.out.println(string);

        //28) Find first non-repeated character in a string?

       // just add == 1 --> filter(entry -> entry.getValue() == 1)
    }
}
