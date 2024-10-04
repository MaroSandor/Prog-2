package PyUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> result1 = PyUtils.range(20);
        List<Integer> result2 = PyUtils.range(5, 20);
        List<Integer> result3 = PyUtils.range(5, 20, 2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        List<Integer> szamok = new ArrayList<>();
        szamok.add(2);
        szamok.add(3);
        szamok.add(5);

        kiir(szamok);
    }

    public static void kiir(List<Integer> lista) {
        System.out.println(lista);
    }
}
