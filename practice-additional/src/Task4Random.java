import java.util.Random;

public class Task4Random {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(random.nextInt(100));
            System.out.print((i + 1) % 10 == 0 ? System.lineSeparator() : " ");
        }
    }
}
