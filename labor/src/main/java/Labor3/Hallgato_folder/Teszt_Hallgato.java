package Labor3.Hallgato_folder;

public class Teszt_Hallgato {
    public static void main(String[] args) {
        Hallgato h = new Hallgato("Kiss Panna", "QWE123", 2.4, 2);
        // System.out.println(h.nev);
        System.out.println(h.getNev());
        h.setNev("Nagy Panna");
        System.out.println(h.getNev());
        h.koszon(3);
        
        System.out.println(h.toString());
    }
}
