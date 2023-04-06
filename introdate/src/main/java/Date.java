import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Date {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate anotherDate = LocalDate.of(2015, 1, 20);

        LocalDateTime dateTime = LocalDateTime.of(2015, Month.JANUARY, 20, 10, 15);
        LocalDateTime anotherDateTime = LocalDateTime.of(2015, Month.JANUARY, 20, 10, 15, 30);
        LocalDateTime thirdDateTime = LocalDateTime.now();

        LocalTime time = LocalTime.of(10, 15);

        System.out.println(date);
        System.out.println(anotherDate);
        System.out.println(dateTime);
        System.out.println(anotherDateTime);
        System.out.println(thirdDateTime);
        System.out.println(time);
    }
}
