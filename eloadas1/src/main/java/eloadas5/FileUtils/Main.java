package eloadas5.FileUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "/home/marosandor/Workspace/Prog-2/eloadas1/src/main/java/eloadas5/FileUtils/mozik.csv";
        List<String> lines = FileUtils.readLines(filename);

        for (String sor : lines) {
            String[] results = sor.split(";");
            for (int i = 2; i < results.length; i = i + 3) {
                System.out.println(results[i]);
            }
//            System.out.println("'" + sor + "'");
        }

        // ---
        String s = "[asdasd]";
        s.replace('[', ' ');
        s.replace(']', ' ');

        for (char c : s.toCharArray()) {
            System.out.println(c);
        }
        // ---
    }
}
