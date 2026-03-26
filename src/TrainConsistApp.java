import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        // UC1 + UC2 (existing)
        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies:");
        System.out.println(passengerBogies);

        // UC3: Track unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (with duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG103");
        bogieIDs.add("BG102"); // duplicate

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIDs);
    }
}