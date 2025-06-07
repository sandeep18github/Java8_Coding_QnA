package CtsJavaInterw;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimeNDate {
    public static void main(String[] args) {
        //32) Find the age of a person in years if the birthday has given?

        LocalDate birthDay = LocalDate.of(1998, 10, 18);
        LocalDate now = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDay,now));

    }
}
