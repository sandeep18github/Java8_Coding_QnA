package CtsJavaInterw;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {
    public static void main(String[] args) {
        //12) Java 8 program to check if two strings are anagrams or not?
        String s1 = "RaceCar";
        String s2 = "CarRace";

        String str1 = Stream.of(s1.split("")).map(f -> f.toUpperCase()).sorted().collect(Collectors.joining());

        String str2 = Stream.of(s2.split("")).map(f -> f.toUpperCase()).sorted().collect(Collectors.joining());

        System.out.println(str1.equals(str2)?"Anagram":"Not Anagram");

    }
}
