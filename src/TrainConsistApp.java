import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // UC7: Sorting bogies using Comparator
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 48));

        // Sort by capacity
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Bogies sorted by capacity:\n");

        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}