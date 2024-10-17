package eloadas5.ZH_fel;

import java.util.List;

public class Main {
    private static double convertTimeToHours(String time) {
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2]);
        return hours + minutes / 60.0 + seconds / 3600.0;
    }

    public static void main(String[] args) {
        String filename = "/home/marosandor/Workspace/Prog-2/eloadas/src/main/java/eloadas5/ZH_fel/datas.csv";
        List<String> lines = FileUtils.readLines(filename);

        double maxAvgSpeed = 0;
        String maxSpeedMonth = "";

        for (int i = 1; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");
            String month = parts[0];
            String time = parts[1];
            double distance = Double.parseDouble(parts[2]);

            double hours = convertTimeToHours(time);
            double avgSpeed = distance / hours;

            System.out.printf("%s: %.2f km/h%n", month, avgSpeed);

            if (avgSpeed > maxAvgSpeed) {
                maxAvgSpeed = avgSpeed;
                maxSpeedMonth = month;
            }
        }

        System.out.printf("%nLegmagasabb átl. seb.: %s: %.2f km/h%n", maxSpeedMonth, maxAvgSpeed);
    }
}
