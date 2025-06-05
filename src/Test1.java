import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        //find even num squres
        List<Integer> collect = list.stream().filter(p -> p % 2 == 0).map(f -> f * f).collect(Collectors.toList());
        System.out.println(collect);

        //find even num squres sum
        int sum = list.stream().filter(p -> p % 2 == 0).mapToInt(f -> f * f).sum();
        System.out.println(sum);
    }
}
