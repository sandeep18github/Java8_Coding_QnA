package CtsJavaInterw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] array = {5, 1, 7, 3, 9, 6};

        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.toString(array));

        //Approch 2
        int[] array2 = {5, 1, 7, 3, 9, 6};

        int[] array1 = IntStream.rangeClosed(1, array2.length).map(c -> array2[array2.length - c]).toArray();
        System.out.println(Arrays.toString(array1));

    }
}