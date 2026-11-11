import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private final String name;
    private final Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getBirthDateFormatted(int style) {
        DateFormat formatter = DateFormat.getDateInstance(style, new Locale("ru", "RU"));
        return formatter.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", дата рождения: " + getBirthDateFormatted(DateFormat.MEDIUM);
    }
}
