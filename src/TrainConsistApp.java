public class TrainConsistApp {

    public static boolean search(String[] ids, String key) {

        if (ids.length == 0) {
            throw new IllegalStateException("No bogies available in train.");
        }

        for (String id : ids) {

            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Search with Exception Handling ===");

        String[] ids = {"BG101","BG205","BG309"};

        String key = "BG205";

        boolean result = search(ids, key);

        if (result)
            System.out.println("Bogie found.");
        else
            System.out.println("Bogie not found.");
    }
}