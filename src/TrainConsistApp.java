import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // UC2: Add bogie
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bogie name to add: ");
        String bogie = sc.nextLine();

        trainConsist.add(bogie);

        System.out.println("Bogie added successfully.");
        System.out.println("Updated number of bogies: " + trainConsist.size());

        // UC3: Display train consist
        System.out.println("\nCurrent Train Consist:");

        if (trainConsist.isEmpty()) {
            System.out.println("No bogies attached.");
        } else {
            for (String b : trainConsist) {
                System.out.println("- " + b);
            }
        }
    }
}