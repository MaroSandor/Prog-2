import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kérjük meg a felhasználót, hogy adjon meg egy számot a prímtényezős
        // felbontáshoz
        System.out.print("Add meg a számot a prímtényezős felbontáshoz: ");
        int number = scanner.nextInt();

        // Szerezzük meg a megadott szám prímtényezőit
        List<Integer> factors = primeFactorization(number);

        // Írjuk ki a prímtényezős felbontás eredményét
        System.out.println("A(z) " + number + " prímtényezős felbontása: " + factors);
    }

    // Metódus a megadott szám prímtényezős felbontásának kiszámításához
    public static List<Integer> primeFactorization(int number) {
        List<Integer> factors = new ArrayList<>();

        // Iteráljunk 2-től a megadott számig, hogy megtaláljuk a prímtényezőket
        for (int i = 2; i <= number; i++) {
            // Amíg az 'i' maradék nélkül osztja a 'number'-t, adjuk hozzá az 'i'-t a
            // tényezők listájához
            while (number % i == 0) {
                factors.add(i); // Adjuk hozzá az 'i'-t mint prímtényezőt
                number /= i; // Osztjuk el a 'number'-t 'i'-vel, hogy folytassuk a faktorizálást
            }
        }

        // Térjünk vissza a prímtényezők listájával
        return factors;
    }
}

