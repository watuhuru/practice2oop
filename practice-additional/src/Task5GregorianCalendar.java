import java.util.GregorianCalendar;

public class Task5GregorianCalendar {
    private static void printDate(String label, GregorianCalendar calendar) {
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.printf("%s: %02d.%02d.%04d%n", label, day, month, year);
    }

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        printDate("Текущая дата", calendar);
        calendar.setTimeInMillis(1234567898765L);
        printDate("Дата для 1234567898765 мс", calendar);
    }
}
