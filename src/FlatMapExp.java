import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExp {
    public static void main(String[] args) {
        // to make 2 list into one list using FlatMap
        List<List<String>> list = Arrays.asList(Arrays.asList("Apple", "Grape", "Banana","Pappaya","Kiwi"),
                                                Arrays.asList("Mango", "Orange", "Pineapple","Berries"));

        List<String> collect = list.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(collect);
        //List out the fruits starts with "B"
        List<String> collect1 = list.stream().flatMap(List::stream).filter(p->p.startsWith("B")).collect(Collectors.toList());
        System.out.println(collect1);



    }

}
