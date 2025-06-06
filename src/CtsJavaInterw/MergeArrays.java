package CtsJavaInterw;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {
    public static void main(String[] args) {
        //9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?

        int[] a = {4, 2, 7, 1};

        int[] b = {8, 3, 9, 5};

        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(array));

    }
}
