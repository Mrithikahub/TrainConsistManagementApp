// UC15: Safe Cargo Assignment Using try-catch-finally

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Runtime Exception for Cargo Safety
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

// Goods Bogie
class GoodsBogie {

    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    void assignCargo(String cargoType) {

        try {

            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Petroleum cannot be assigned to Rectangular bogie"
                );
            }

            cargo = cargoType;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Cargo assignment validation completed.");
        }
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {

            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Created: " + b1);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");

        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");

        System.out.println("\nProgram continues safely...");
    }
}