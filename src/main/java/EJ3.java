import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class EJ3 {
    public static void main(String[] args) {

        List<EJ3<Integer, Integer>> randomParejasList1 = new ArrayList<>();
        fillListWithRandomParejas(randomParejasList1);
        System.out.println("List 1 (ArrayList): " + randomParejasList1);
}
