// GYAKORLAT 2

import java.util.Scanner; // Scanner import

public class App {
    public static int getKerulet(int a, int b) {
        return 2 * (a + b);
    }
    public static void main(String[] args) throws Exception {
        // TODO: Terület kiszámítása
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Add meg téglalp egyik oldalát: ");
        a = input.nextInt();
        
        System.out.print("Add meg téglalp egyik oldalát: ");
        b = input.nextInt();

        System.out.println("A téglalap kerülete: " + getKerulet(a, b) + " cm");
    }
}
