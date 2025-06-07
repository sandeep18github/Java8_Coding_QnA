package CtsJavaInterw;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {

        //Fibonacci series
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(i-> System.out.print(i+" "));
    }
}
