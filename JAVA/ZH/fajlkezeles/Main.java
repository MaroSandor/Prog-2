import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "/home/marosandor/Workspace/Prog-2/JAVA/ZH/fajlkezeles/mozik.csv";
        List<String> lines = FileUtils.readLines(filename);

        for (String sor : lines) {
            String[] results = sor.split(";");
            for (int i = 0; i < results.length - 2; i++) {
                System.out.println(results[i + 2]);
            }
            // System.out.println(sor);
        }
    }
}
