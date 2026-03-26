import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 48));

        // UC7: Sorting
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nBogies sorted by capacity:\n");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // UC8: Filtering using Stream
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):\n");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }
    }
}