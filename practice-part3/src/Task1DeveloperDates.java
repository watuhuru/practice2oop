import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task1DeveloperDates {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        format.setLenient(false);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите дату получения задания (дд.ММ.гггг ЧЧ:мм): ");
            String input = scanner.nextLine();
            ParsePosition position = new ParsePosition(0);
            Date received = format.parse(input, position);
            if (received == null || position.getIndex() != input.length()) {
                System.out.println("Ошибка: введите корректную дату и время.");
                return;
            }
            System.out.println("Разработчик: Гуцалюк");
            System.out.println("Дата получения: " + format.format(received));
            System.out.println("Дата сдачи: " + format.format(new Date()));
        }
    }
}
