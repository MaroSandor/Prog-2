import java.util.Scanner;

public class LNKO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kérjük meg a felhasználót, hogy adjon meg két pozitív egész számot
        System.out.print("Add meg az első számot: ");
        int a = scanner.nextInt();
        System.out.print("Add meg a második számot: ");
        int b = scanner.nextInt();

        // Számítsuk ki a két szám legnagyobb közös osztóját
        int lnko = lnko(a, b);

        // Írjuk ki a legnagyobb közös osztó eredményét
        System.out.println("A(z) " + a + " és " + b + " legnagyobb közös osztója: " + lnko);
    }

    // Metódus a legnagyobb közös osztó (LNKO) kiszámításához az euklideszi
    // algoritmussal
    public static int lnko(int a, int b) {
        // Addig folytatjuk, amíg a második szám nem lesz nulla
        while (b != 0) {
            int temp = b; // Tároljuk el ideiglenesen a 'b' értékét
            b = a % b; // 'b' lesz az 'a' és 'b' maradéka
            a = temp; // 'a' felveszi a korábbi 'b' értékét
        }

        // Térjünk vissza az 'a' értékével, ami a legnagyobb közös osztó
        return a;
    }
}