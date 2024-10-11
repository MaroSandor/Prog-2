package eloadas5;

public class StringBuilder_v2 {
    public static void main(String[] args) {
        String s = "Java 21";

        StringBuilder sb = new StringBuilder(s);

        String result = sb.toString();

        System.out.println(result);

        String forditott = new StringBuilder("Laci").reverse().toString();
    }
}
