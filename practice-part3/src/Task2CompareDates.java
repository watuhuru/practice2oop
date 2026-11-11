import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2CompareDates {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        format.setLenient(false);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите дату и время (дд.ММ.гггг ЧЧ:мм): ");
            String input = scanner.nextLine();
            ParsePosition position = new ParsePosition(0);
            Date entered = format.parse(input, position);
            if (entered == null || position.getIndex() != input.length()) {
                System.out.println("Ошибка: введите корректную дату и время.");
                return;
            }
            Date now = new Date();
            now.setTime(now.getTime() / 60000 * 60000);
            System.out.println("Текущие дата и время: " + format.format(now));
            int comparison = entered.compareTo(now);
            if (comparison < 0) {
                System.out.println("Введённая дата раньше текущей.");
            } else if (comparison > 0) {
                System.out.println("Введённая дата позже текущей.");
            } else {
                System.out.println("Даты и время совпадают.");
            }
        }
    }
}
