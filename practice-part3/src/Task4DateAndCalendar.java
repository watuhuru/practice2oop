import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4DateAndCalendar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите год, месяц, число, часы и минуты через пробел: ");
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int hour = scanner.nextInt();
            int minute = scanner.nextInt();
            Calendar calendar = Calendar.getInstance();
            calendar.clear();
            calendar.setLenient(false);
            calendar.set(year, month - 1, day, hour, minute);
            Date date = calendar.getTime();
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            System.out.println("Date: " + format.format(date));
            System.out.println("Calendar: " + format.format(calendar.getTime()));
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: нужно ввести пять целых чисел.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: такой даты или времени не существует.");
        }
    }
}
