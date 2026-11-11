import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task3StudentDemo {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Имя студента: ");
            String name = scanner.nextLine();
            System.out.print("Дата рождения (дд.ММ.гггг): ");
            String input = scanner.nextLine();
            ParsePosition position = new ParsePosition(0);
            Date birthDate = format.parse(input, position);
            if (birthDate == null || position.getIndex() != input.length()) {
                System.out.println("Ошибка: введите корректную дату.");
                return;
            }
            Student student = new Student(name, birthDate);
            System.out.println(student);
            System.out.println("Короткий формат: " + student.getBirthDateFormatted(DateFormat.SHORT));
            System.out.println("Средний формат: " + student.getBirthDateFormatted(DateFormat.MEDIUM));
            System.out.println("Полный формат: " + student.getBirthDateFormatted(DateFormat.FULL));
        }
    }
}
