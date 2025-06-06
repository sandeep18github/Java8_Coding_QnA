package CtsJavaInterw;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfDigits {

    public static void main(String[] args) {
        //13) Find sum of all digits of a number in Java 8?

        int i = 15623;
        Integer collect = Arrays.stream(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(collect);



    }
}
