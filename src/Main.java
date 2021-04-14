import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module4
 * @class Main
 * @since 11.04.2021 - 15.49
 **/

public class Main {
    public static void main(String[] args) throws IOException {
        LocalDateTime start = LocalDateTime.now();
        LogManager.logsByDateToFile("logs.txt",
                LocalDate.of(2020, Month.JANUARY, 1));
        LogManager.logsByDateToFile("logs.txt",
                LocalDate.of(2020, Month.FEBRUARY, 1));
        LogManager.logsByDateToFile("logs.txt",
                LocalDate.of(2020, Month.MARCH, 1));
        LogManager.logsByDateToFile("logs.txt",
                LocalDate.of(2019, Month.NOVEMBER, 1));
        LogManager.logsByDateToFile("logs.txt",
                LocalDate.of(2019, Month.DECEMBER, 1));
        LocalDateTime finish = LocalDateTime.now();

        System.out.println(ChronoUnit.MILLIS.between(start, finish));
    }
}
