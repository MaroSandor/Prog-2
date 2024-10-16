import java.util.Scanner;

public class LKKT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kérjük meg a felhasználót, hogy adjon meg két pozitív egész számot
        System.out.print("Add meg az első számot: ");
        int a = scanner.nextInt();
        System.out.print("Add meg a második számot: ");
        int b = scanner.nextInt();

        // Számítsuk ki a két szám legkisebb közös többszörösét
        int lkkt = lkkt(a, b);

        // Írjuk ki a legkisebb közös többszörös eredményét
        System.out.println("A(z) " + a + " és " + b + " legkisebb közös többszöröse: " + lkkt);
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

    // Metódus a legkisebb közös többszörös (LKKT) kiszámításához
    public static int lkkt(int a, int b) {
        // Az LKKT kiszámítható az (a * b) / LNKO képlettel
        return (a * b) / lnko(a, b);
    }
}