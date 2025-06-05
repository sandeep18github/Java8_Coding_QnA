import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test4 {

    public static void main(String[] args) {

        String wrds3 = "SandeepKumar";

        LinkedHashMap<Character, Long> collect6 = wrds3.toLowerCase().chars().mapToObj(c -> (char) c).filter(Character::isLetter).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        collect6.forEach((ch,value)-> System.out.println(ch +"  "+value));

    }
}
