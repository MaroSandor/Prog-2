package eloadas5.FileUtils;

import java.util.List;

public class MonthlySpeedCalculator {
    public static void main(String[] args) {
        String filename = "/home/marosandor/Workspace/Prog-2/eloadas/src/main/java/eloadas5/FileUtils/monthly_data.csv";
        List<String> lines = FileUtils.readLines(filename);

        double maxAvgSpeed = 0;
        String maxSpeedMonth = "";

        for (String line : lines) {
            String[] parts = line.split(";");
            String month = parts[0];
            String time = parts[1];
            double distance = Double.parseDouble(parts[2].replace(",", "."));

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

    private static double convertTimeToHours(String time) {
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2]);
        return hours + minutes / 60.0 + seconds / 3600.0;
    }
}