import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // UC6: HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogies with capacity
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 48);

        System.out.println("Bogie Capacity Details:\n");

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}