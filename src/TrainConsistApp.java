import java.util.Arrays;

public class TrainConsistApp {

    public static boolean binarySearch(String[] ids, String key) {

        Arrays.sort(ids);

        int low = 0;
        int high = ids.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(ids[mid]);

            if (result == 0)
                return true;

            if (result > 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Binary Search Bogie ID ===");

        String[] ids = {"BG309","BG101","BG550","BG205","BG412"};

        String key = "BG205";

        boolean found = binarySearch(ids, key);

        if (found)
            System.out.println("Bogie found.");
        else
            System.out.println("Bogie not found.");
    }
}