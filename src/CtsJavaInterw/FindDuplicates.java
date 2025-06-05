package CtsJavaInterw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {
        //find duplicates from given list  {10,15,8,49,25,98,98,98,15,32,15}

        List<Integer> list = Arrays.asList(10,15,98,49,15,25,98,98,32,15);

        Set<Integer> seen = new HashSet();

        List<Integer> collect = list.stream().filter(c -> !seen.add(c)).distinct().collect(Collectors.toList());
        System.out.println(collect);
        //System.out.println(seen);


    }
}
