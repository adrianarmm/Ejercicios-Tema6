import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class EJ2 {

    public static void main(String[] args) {
        // Create a list using ArrayList
        List<Integer> randomIntegersList1 = new ArrayList<>();
        fillListWithRandomIntegers(randomIntegersList1);
        System.out.println("List 1 (ArrayList): " + randomIntegersList1);

        List<Integer> randomIntegersList2 = new LinkedList<>();
        fillListWithRandomIntegers(randomIntegersList2);
        System.out.println("List 2 (LinkedList): " + randomIntegersList2);
    }

    private static void fillListWithRandomIntegers(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(1000));
        }
    }
}