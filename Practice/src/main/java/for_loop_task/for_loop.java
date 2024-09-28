package for_loop_task;

public class for_loop {
    public static void main(String[] args) {
        double input = 17;

        for (double i = 0; i < input; i += 0.5) {
            input -= 0.5;
        }

        System.out.println(input);
    }
}
