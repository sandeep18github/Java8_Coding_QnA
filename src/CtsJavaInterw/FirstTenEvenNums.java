package CtsJavaInterw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstTenEvenNums {

    public static void main(String[] args) {
        //1st 10 even num
        IntStream.rangeClosed(1,10).map(f->f * 2).forEach(System.out::println);
    }
}
