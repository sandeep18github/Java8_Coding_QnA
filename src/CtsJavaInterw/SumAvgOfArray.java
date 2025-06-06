package CtsJavaInterw;

import java.util.Arrays;

public class SumAvgOfArray {

    public static void main(String[] args) {
        //16) Given an integer array, find sum and average of all elements?

        int[] a={45, 12, 56, 15, 24, 75, 31, 89};

        int sum = Arrays.stream(a).sum();

        double asDouble = Arrays.stream(a).average().getAsDouble();
        System.out.printf("Sum: %d%nAvg: %.2f%n",sum,asDouble);

        //Approch - 2

        System.out.printf("Sum: %d%nAvg: %.2f%n",Arrays.stream(a).sum(),Arrays.stream(a).average().orElse(0));
    }
}
