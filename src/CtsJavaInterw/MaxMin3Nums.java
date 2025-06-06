package CtsJavaInterw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin3Nums {

    public static void main(String[] args) {
        //11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> min = listOfIntegers.stream().sorted().limit(3).collect(Collectors.toList());
        List<Integer> max = listOfIntegers.stream().sorted().skip(listOfIntegers.size()-3).collect(Collectors.toList());

        //List<Integer> max2 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

        System.out.println("Min 3 nums ==> "+min+'\n'+"Max 3 nums ==> "+max);

        //Approch -2

        List<List<Integer>>  minMaxNumbers =listOfIntegers.stream().sorted().collect(Collectors.collectingAndThen( Collectors.toList(),sortedList->List.of(sortedList.subList(0,3),sortedList.subList(sortedList.size()-3,sortedList.size()))));

        System.out.println("Min 3 nums ===> "+minMaxNumbers.get(0)+'\n'+"Max 3 nums ===> "+minMaxNumbers.get(1));


    }
}
