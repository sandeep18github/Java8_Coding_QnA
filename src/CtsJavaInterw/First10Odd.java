package CtsJavaInterw;

import java.util.stream.Stream;

public class First10Odd {

    public static void main(String[] args) {
        //30) First 10 odd numbers
        Stream.iterate(1,n->n+2).limit(10).forEach(i-> System.out.print(i+" "));
    }
}
