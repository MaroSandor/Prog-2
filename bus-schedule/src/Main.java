import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}