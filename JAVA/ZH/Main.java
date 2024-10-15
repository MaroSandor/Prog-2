
import java.util.List;

class FootballTeam {
    private List<String> players;
    private int scoredGoals;
    private int concededGoals;

    public int goals() {
        return concededGoals - scoredGoals;
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}