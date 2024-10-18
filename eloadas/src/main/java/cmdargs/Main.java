package cmdargs;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Kérlek, adj meg legalább egy sztringet parancssori argumentumként.");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            String word = args[i];
            for (int j = 0; j < word.length(); j++) {
                System.out.println(word.charAt(j));
            }
            System.out.println(args[i]);
        }
    }
}
