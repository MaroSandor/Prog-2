public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Adjon meg egy számsorozatot!");
            return;
        }

        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (String data : args) {
            System.out.println(Integer.valueOf(data));
            int number = Integer.parseInt(data);
            sum += number;
            if (number > maxNum) {
                maxNum = number;
            }
            if (number < minNum) {
                minNum = number;
            }
        }

        System.out.println("A számsorozat tagjainak összege: " + sum);
        System.out.println("A legnagyobb szám: " + maxNum);
        System.out.println("A legkisebb szám: " + minNum);
    }
}
