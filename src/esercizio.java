
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

//Using LocaleDate or another Date class calculate and print:
//How many days are left till the end of the month
//How many days are left till the end of the year, using the length() method from java.time.Year.of()
public class esercizio {

        public static void main(String[] args) {
            LocalDate today = LocalDate.now();
            LocalDate endOfMonth = LocalDate.of(2023, Month.JUNE, 30);
            Year thisYear = Year.of(2023);


            System.out.println("Days left till the end of the month: " + calculatorDayLeftMonth(today, endOfMonth));

            System.out.println("Days left till the end of the year: " + calculatorDayLeftYear(today, thisYear));
        }
        static  int calculatorDayLeftMonth(LocalDate todayDate, LocalDate endOfMonthDate){
            int dayLeftMonth = endOfMonthDate.getDayOfMonth() - todayDate.getDayOfMonth();
            return dayLeftMonth;
        }
        static  int calculatorDayLeftYear(LocalDate todayDate, Year yearDays){
            int dayLeftYear = yearDays.length() - todayDate.getDayOfYear();
            return dayLeftYear;
        }

}
