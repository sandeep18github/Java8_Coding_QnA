package CtsJavaInterw;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachString {
    public static void main(String[] args) {
        //18) Reverse each word of a string using Java 8 streams?

        String str = "Java Concept Of The Day";

        String collect = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
