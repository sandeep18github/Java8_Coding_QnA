package CtsJavaInterw;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateOddnEvenNums {
//list out odd n even nums from given  list
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(71, 18, 18,42, 71,21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(p -> p % 2 == 0));

        System.out.println("Even Num "+collect.get(true)+"\n"+ "Odd Num "+collect.get(false));

    }
}
