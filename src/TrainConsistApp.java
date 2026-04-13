import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Sort Bogie Names ===");

        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        Arrays.sort(bogies);

        System.out.println("Sorted bogie names: " + Arrays.toString(bogies));
    }
}