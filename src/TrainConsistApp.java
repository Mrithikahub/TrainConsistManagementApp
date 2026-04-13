public class TrainConsistApp {

    public static boolean linearSearch(String[] ids, String key) {

        for (String id : ids) {

            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Linear Search Bogie ID ===");

        String[] ids = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        boolean found = linearSearch(ids, searchKey);

        if (found)
            System.out.println("Bogie found.");
        else
            System.out.println("Bogie not found.");
    }
}