import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapExp{

    public static void main(String[] args) {
        //Multiply each num by 2 using Map
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);

        List<Integer> numMultiple2 = num.stream().map(f -> f * 2).collect(Collectors.toList());

        System.out.println(numMultiple2);

    }
}


