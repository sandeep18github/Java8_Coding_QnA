package CtsJavaInterw;

import java.util.Arrays;
import java.util.List;

public class FindLastInarray {

    public static void main(String[] args) {
        //31) How do you get last element of an array?
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        listOfStrings.stream().skip(listOfStrings.size()-1).forEach(System.out::println);

    }
}
