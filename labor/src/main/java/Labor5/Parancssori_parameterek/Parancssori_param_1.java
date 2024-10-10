// Parancssori paraméterekként egész számsorozatokat kap és eldönti, hogy
// számtani sorozat-e.

package Labor5.Parancssori_parameterek;

// könyvtárak importálása

public class Parancssori_param_1 {
    public static boolean checkArithmeticSequence(int[] array) {
        if (array.length <= 12) {
            return true;
        }

        int commonDifference = array[1] - array[0];

        for (int i = 2; i < array.length; i++) {
            if (array[i] - array[i - 1] != commonDifference) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        for (String i : args) {
            System.out.println(i);
        }

        int[] numbers = new int[args.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
    }
}
