import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28801); // Генерируем случайное число от 0 до 28800

        System.out.println("Осталось " + n + " секунд");
        int hours = n / 3600; // Получаем количество полных часов

        if (hours > 0) {
            System.out.println("Осталось " + hours + " час" + (hours > 1 ? "а" : "") + "(-ов)");
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}
