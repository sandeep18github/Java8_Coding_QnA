import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//WAP to print names.lenth greater than 4
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sandeep", "Pavan", "Venu", "Ramu", "Feroz");

        //names.stream().filter(p-> p.length() == 4).forEach(p-> System.out.println(p));
        List<String> namesWithLength4 = names.stream()
                                              .filter(p -> p.length() > 4)
                                               .collect(Collectors.toList());

        System.out.println(namesWithLength4);

    }
}