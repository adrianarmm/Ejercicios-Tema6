import java.util.LinkedList;
import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Añadir cadena");
            System.out.println("2. Eliminar última cadena");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            if (opcion == 1) {
                System.out.print("Introduce una cadena: ");
                String cadena = scanner.nextLine();
                lista.addLast(cadena);
                System.out.println("Lista: " + lista);
            } else if (opcion == 2) {
                if (!lista.isEmpty()) {
                    String ultimaCadena = lista.removeLast();
                    System.out.println("Se ha eliminado la última cadena: " + ultimaCadena);
                    System.out.println("Lista: " + lista);
                } else {
                    System.out.println("La lista está vacía.");
                }
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }
// Explicacion de que lista he ultilizado y porque.
// He utilizado LinkedList porque es más eficiente que ArrayList para añadir y eliminar elementos al final de la lista.
}

