import java.util.Date;

public class Task3Date {
    public static void main(String[] args) {
        long[] times = {10_000L, 100_000L, 1_000_000L, 10_000_000L,
                100_000_000L, 1_000_000_000L, 10_000_000_000L, 100_000_000_000L};
        Date date = new Date();
        for (long time : times) {
            date.setTime(time);
            System.out.println(time + " мс: " + date.toString());
        }
    }
}
