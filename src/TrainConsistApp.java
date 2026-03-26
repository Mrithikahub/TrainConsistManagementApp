import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message (UC1)
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist
        List<String> passengerBogies = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + passengerBogies.size());

        // UC2: Add passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper exist? " + exists);

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}