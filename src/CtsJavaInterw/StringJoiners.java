package CtsJavaInterw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoiners {
    public static void main(String[] args) {
        //6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?

        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String collect = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect);

    }
}
