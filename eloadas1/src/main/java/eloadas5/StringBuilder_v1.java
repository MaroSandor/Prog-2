package eloadas5;

/*
 * 1-től 20-ig generáljunk számokat,
 * s ezeket írjuk le egymás mellé
 * Az eredmény egy sztring legyen.
 */

public class StringBuilder_v1 {
    // ZH:
    // 1. feladat: egyszerű osztály kell megírni
    // 2. feladat: parancssori argumentumok segítségével kell megírni a programot
    // vagy standard inputról bekért adatokkal
    // 3. feladat: fájlbeolvasás, sorokkal végzett műveletek
    // 4. feladat: string kezelés, tömbök

    public static void main(String[] args) {
        String s = "";

        // for (int i = 1; i <= 20; i++) {
        // s += String.valueOf(i);${}
        // }

        // System.out.println(s);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 1000000; i++) {
            sb.append(i);
        }

        String result = sb.toString();

        System.out.println(result.length());
    }
}
