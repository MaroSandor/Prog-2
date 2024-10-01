import java.time.Year;
import java.util.Scanner;

// Book osztály, amely könyveket reprezentál
class Book {
    public String title;
    public String author;
    public int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}

// Person osztály, amely egy személyt reprezentál
class Person {
    public String name;
    public String mail;
    public int yearOfBirth;

    public Person(String name, String mail, int yearOfBirth) {
        this.name = name;
        this.mail = mail;
        this.yearOfBirth = yearOfBirth;
    }

    // A személy életkorát számolja ki
    public int howOldAreYou() {
        int currentYear = Year.now().getValue();
        return currentYear - yearOfBirth;
    }
}

// Téglalap osztály, amely téglalapokat reprezentál
class Teglalap {
    public int a;
    public int b;

    public Teglalap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // A téglalap területét számolja ki
    public int getTerulet() {
        return this.a * this.b;
    }

    // A téglalap kerületét számolja ki
    public int getKerulet() {
        return 2 * (this.a + this.b);
    }
}

// Fő osztály, amely a program futását vezérli
public class Osztalyok {
    public static void main(String[] args) {
        // Book osztály és objektumok létrehozása
        Book book1 = new Book("Füty Imre", "Basz Tamás halála", 100);
        Book book2 = new Book("Frank Herbert", "Dűne", 412);

        // Könyvek adatai kiíratása
        System.out.println("1. könyv címe: " + book1.title);
        System.out.println("2. könyv szerzője: " + book2.author);

        // Person osztály és objektum létrehozása
        Person person = new Person("Anne", "anne@hello.com", 1999);

        // Személy életkorának kiíratása
        System.out.printf("%s életkora: %d éves%n", person.name, person.howOldAreYou());

        // Téglalap bekéréssel
        Scanner input = new Scanner(System.in);
        System.out.print("Add meg a téglalap egyik oldalát: ");
        int a = input.nextInt();
        System.out.print("Add meg a téglalap másik oldalát: ");
        int b = input.nextInt();

        // Téglalap objektum létrehozása és adatok kiíratása
        Teglalap teglalap = new Teglalap(a, b);
        System.out.printf("A téglalap területe: %s cm2%n", teglalap.getTerulet());
        System.out.printf("A téglalap kerülete: %s cm%n", teglalap.getKerulet());

        input.close(); // Scanner bezárása
    }
}