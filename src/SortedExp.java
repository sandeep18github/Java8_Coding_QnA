import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedExp {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 1, 3, 5, 4, 7, 6, 8, 10, 9);
        //asedning order
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        //Desecending order
        List<Integer> desc=list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(desc);
        //skip() method
        List<Integer> collect = list.stream().skip(3).collect(Collectors.toList());
        System.out.println(collect);
        //limit() method
        List<Integer> collect2 = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect2);

        //filetr even numbers and skip 1st 2 elements

        List<Integer> skip = list.stream().sorted().filter(p -> p % 2 == 0).skip(2).collect(Collectors.toList());
        System.out.println(skip);
    }
}
