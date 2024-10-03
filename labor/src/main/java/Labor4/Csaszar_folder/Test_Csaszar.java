package Labor4.Csaszar_folder;

import java.util.Scanner;

public class Test_Csaszar {
    public static void main(String[] args) {
        Csaszar[] t = new Csaszar[30];

        Scanner scanner = new Scanner(System.in);

        int index = 0;
        String nev; // A beolvasott neve
        int datum; // A beolvasott születési éve

        while ((datum = scanner.nextInt()) != 0) {
            nev = scanner.next();
            t[index++] = new Csaszar(nev, datum);
        }

        Csaszar min = t[0];

        for (int i = 0; i < index; i++) {
            if (t[i].getBirthOfYear() < min.getBirthOfYear()) {
                min = t[i];
            }
        }

        System.out.println(min);

        scanner.close();
    }
}
