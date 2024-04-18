import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ8 {

    public static void main(String[] args) {
        Map<Integer, Character> numberLetterMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("Introduce una opción (insertar, recuperar, salir):");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "insertar":
                    System.out.print("Introduce el número: ");
                    int number = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Introduce la letra: ");
                    char letter = scanner.nextLine().charAt(0);
                    numberLetterMap.put(number, letter);
                    break;
                case "recuperar":
                    System.out.print("Introduce el número: ");
                    int numberToRecover = scanner.nextInt();
                    if (numberLetterMap.containsKey(numberToRecover)) {
                        System.out.println("La letra correspondiente al número " + numberToRecover + " es: " + numberLetterMap.get(numberToRecover));
                    } else {
                        System.out.println("No existe un número correspondiente a la letra.");
                    }
                    break;
                case "salir":
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}