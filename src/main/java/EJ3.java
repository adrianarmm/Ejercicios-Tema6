import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class EJ3 {
    public static void main(String[] args) {

        List<AbstractMap.SimpleEntry<Integer, Integer>> randomParejasList1 = new ArrayList<>();
        fillListWithRandomParejas(randomParejasList1);
        System.out.println("List 1 (ArrayList): " + randomParejasList1);

        List<AbstractMap.SimpleEntry<Integer, Integer>> randomParejasList2 = new LinkedList<>();
        fillListWithRandomParejas(randomParejasList2);
        System.out.println("List 2 (LinkedList): " + randomParejasList2);
    }

    private static void fillListWithRandomParejas(List<AbstractMap.SimpleEntry<Integer, Integer>> list) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(new AbstractMap.SimpleEntry<>(random.nextInt(1000), random.nextInt(1000)));
        }
    }
}
