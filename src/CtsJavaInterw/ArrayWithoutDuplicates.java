package CtsJavaInterw;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayWithoutDuplicates {

    public static void main(String[] args) {

        //10) How do you merge two unsorted arrays into single sorted array without duplicates?
        int[] a = {3, 1, 4, 2, 1, 3, 4};
        int[] b = {8, 6, 5, 7, 5, 8, 9};

        int[] intArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(intArray));
    }

}
