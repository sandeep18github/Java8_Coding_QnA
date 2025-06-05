import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Test2 {
    public static void main(String[] args) {
         String name="Sandeep Kumar";
         //to find repeation of A
        long count = name.toLowerCase().chars().filter(c -> c == 'a').count();
        System.out.println(" A  -> "+ count);

        System.out.println("-----------------------------------------------------------------------");

        // to know all letter repeating count
        Map<Character, Long> collect = name.toLowerCase()
                //.replaceAll("\\s+", "")
                .chars().mapToObj(c -> (char) c).filter(Character::isLetter)
                //.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                .collect(Collectors.toMap(Function.identity(), c->1L,Long::sum, LinkedHashMap::new));

        collect.forEach((character, c)-> System.out.println(character +" -->"+ c));

        System.out.println("-----------------------------------------------------------------------");

//below string count only letter repeation
        String mail ="Ssandeep kumar045@gmail.com";

        LinkedHashMap<Character, Long> collect1 = mail.toLowerCase().chars()
                .mapToObj(c -> (char) c)
               // .filter(Character::isLetter)
                .filter(c->c =='a')
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect1.forEach((ch,c)-> System.out.println(ch+" -> "+c+"  Original String -> "+mail));

        System.out.println("-----------------------------------------------------------------");

        //in a given string cot the substring

        String input = "i am from bcm and i am working for cts and i am staying in banglore.";

        long count1 = Arrays.stream(input.toLowerCase().split("\\s+")).filter(w -> w.equals("am")).count();
        System.out.println("'am' appears " + count1 + " times.");


        String words = "an apple fall down from a tree a boy seen";


        long a = Arrays.stream(words.toLowerCase().split("\\s+")).filter(w -> w.equals("a")).count();
        System.out.println(a);

        String wrds2 = "SandeepKumar";

        long count2 = wrds2.toLowerCase().chars().filter(c -> c == 'k').count();
        System.out.println(count2);


    }
}
