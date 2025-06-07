package CtsJavaInterw;

import java.util.stream.IntStream;

public class Palindrom {
    public static void main(String[] args) {
        //Palindrom
        String str1 = "Racecar";
        String str = str1.toLowerCase();

        boolean isPalindrom = IntStream.range(0, str.length()/2).allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));

        System.out.printf(isPalindrom?"Palindrom":"Not Palindrom");

    }
}
