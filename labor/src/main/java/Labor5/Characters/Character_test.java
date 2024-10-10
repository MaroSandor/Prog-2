package Labor5.Characters;

import java.util.Scanner;

public class Character_test {
    public static int procces(String heights) {
        int result = 0;

        for (int i = 0; i < heights.length() - 1; i++) {
            int currentHeight = Character.getNumericValue(heights.charAt(i));
            int nextHeight = Character.getNumericValue(heights.charAt(i + 1));

            result += Math.abs(currentHeight - nextHeight);
        }

        return result;
    }

    public static void main(String[] args) {
        // Minden előfordulhat a ZH-ban amit eddig vettünk; az első heti anyag is!!!

        // boolean értékekkel tér vissza
        // System.out.println(Character.isAlphabetic('c'));
        // System.out.println(Character.isDigit('a'));
        // System.out.println(Character.isDigit('2'));
        // System.out.println(Character.isLowerCase('a'));
        // System.out.println(Character.isUpperCase('a'));

        // átalakítja
        // System.out.println(Character.toUpperCase('a'));
        // System.out.println(Character.toLowerCase('A'));

        // visszaadja az Int típusát a megadott karakternek, pl. 4 -> 4, c -> 12
        // System.out.println(Character.getNumericValue('c'));

        // Felhőkarcolós feladat

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(procces(input));
    }
}
