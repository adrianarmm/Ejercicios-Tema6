import java.util.ArrayList;
import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Añadir cadena");
            System.out.println("2. Eliminar cadena");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            if (opcion == 1) {
                System.out.print("Introduce la posición: ");
                int posicion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente
                if (posicion >= 0 && posicion <= lista.size()) { // Validación de la posición
                    System.out.print("Introduce la cadena: ");
                    String cadena = scanner.nextLine();
                    lista.add(posicion, cadena);
                    System.out.println("Lista: " + lista);
                } else {
                    System.out.println("La posición especificada no es válida.");
                }
            } else if (opcion == 2) {
                System.out.print("Introduce la posición de la cadena a eliminar: ");
                int posicion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente
                if (posicion >= 0 && posicion < lista.size()) {
                    String cadenaEliminada = lista.remove(posicion);
                    System.out.println("Se ha eliminado la cadena: " + cadenaEliminada);
                    System.out.println("Lista: " + lista);
                } else {
                    System.out.println("La posición especificada no es válida.");
                }
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}







