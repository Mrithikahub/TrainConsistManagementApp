import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // UC1 to UC4 (existing logic)
        System.out.println("=== Train Consist Management App ===");

        // UC5: LinkedHashSet for ordered unique bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate intentionally
        trainFormation.add("Sleeper");

        System.out.println("\nTrain Formation (Ordered & Unique):");
        System.out.println(trainFormation);
    }
}