package CtsJavaInterw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonElementsInArray {

    public static void main(String[] args) {
        //17) How do you find common elements between two arrays?

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(collect);

        // for uncommon elements
        List<Integer> collect1 = Stream.concat(list1.stream(), list2.stream()).filter(num -> !(list1.contains(num) && list2.contains(num))).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.printf("Common:%s%nUncommon:%s%n",collect,collect1);

    }

}
