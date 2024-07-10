
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class FindAge {

    public static void main(String[] args) {
        //Find the age of a person in years if the birthday has given

        LocalDate birthDay = LocalDate.of(1990, 10, 07);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDay, today));

    }
}
