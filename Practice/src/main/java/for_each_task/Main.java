package for_each_task;

public class Main {
    public static void main(String[] args) {
        String[] names = { "Teszt Elek", "John Doe", "Jane Doe" };

        for (String name : names) {
            System.out.println(String.format("Név: %s", name));
        }

        for (String first_name : names) {
            System.out.println("Név: " + first_name);
        }
    }
}
