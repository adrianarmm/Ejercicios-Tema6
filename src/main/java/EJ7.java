import java.util.LinkedHashMap;
import java.util.Map;

public class EJ7 {

    public static void main(String[] args) {
        Map<String, Integer> numberMap = new LinkedHashMap<>();
        for (int i = 0; i <= 10; i++) {
            String numberName = getNumberName(i);
            numberMap.put(numberName, i);
        }

        System.out.println("Contenido del mapa:");
        for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }

    private static String getNumberName(int number) {
        switch (number) {
            case 0:
                return "cero";
            case 1:
                return "uno";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 10:
                return "diez";
            default:
                throw new IllegalArgumentException("El número debe estar entre 0 y 10");
        }
    }
}