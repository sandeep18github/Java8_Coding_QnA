import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {

        //Filter even num from List
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Num from List ==> "+collect+" Before => "+list);

        //Sum of squares from given List
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list1.stream().mapToInt(f -> f * f).sum();
        System.out.println("sum of squares from List ==> "+sum +" Before => "+list1);

        //Sort the list of strings
        List<String> fruits = Arrays.asList("Banana", "Watermelon", "Oranges", "Apple", "Grapes", "Mango");
        List<String> collect1 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("sort the List ==> "+collect1 +" Before => "+fruits);

        // double the each num of list

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect2 = list2.stream().map(p -> p * 2).collect(Collectors.toList());
        System.out.println(" double the each  num from List ==> "+collect2+" Before => "+list2);

        //find the distict num from List
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4, 1, 5);
        List<Integer> collect3 = num.stream().distinct().collect(Collectors.toList());
        System.out.println(" distict num from List ==> "+collect3+" Before => "+num);

        //groupingby elements with their length
        List<String> fruits1 = Arrays.asList("Banana", "Watermelon", "Oranges", "Apple", "Grapes", "Mango");
        Map<Integer, List<String>> collect4 = fruits1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect4);

        //remove the string contain "an"
        List<String> fruits3 = Arrays.asList("Banana", "Watermelon", "Oranges", "Apple", "Grapes", "Mango");
        List<String> an = fruits3.stream().filter(p -> !p.contains("an")).collect(Collectors.toList());
        System.out.println(an);

        //join string using ","
        List<String> fruits4 = Arrays.asList("Banana", "Watermelon", "Oranges", "Apple", "Grapes", "Mango");

        String collect5 = fruits4.stream().collect(Collectors.joining(", "));
        System.out.println(collect5);




    }
}
