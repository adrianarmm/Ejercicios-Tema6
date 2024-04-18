import java.util.LinkedList;
import java.util.Scanner;

public class EJ6 {

    public static void main(String[] args) {
        LinkedList<String> cadenaLista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("Introduce una opción (insertar, eliminar, mostrar, salir):");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "insertar":
                    String cadena = null;
                    while (cadena == null || cadena.isEmpty()) {
                        System.out.print("Introduce una cadena de caracteres: ");
                        cadena = scanner.nextLine();
                    }
                    int posicion = 0;
                    while (posicion >= cadenaLista.size()) {
                        System.out.print("Introduce la posición para insertar (" + cadenaLista.size() + " posiciones disponibles): ");
                        posicion = scanner.nextInt();
                    }
                    cadenaLista.add(posicion, cadena);
                    for (int i = 0; i < cadenaLista.size() - 1; i++) {
                        if (cadenaLista.get(i).compareToIgnoreCase(cadenaLista.get(i + 1)) > 0) {
                            String temp = cadenaLista.get(i);
                            cadenaLista.set(i, cadenaLista.get(i + 1));
                            cadenaLista.set(i + 1, temp);
                            i = -1; // Vuelve al inicio del bucle para reordenar
                        }
                    }
                    break;
                case "eliminar":
                    System.out.print("Introduce la posición para eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    if (posicionEliminar >= 0 && posicionEliminar < cadenaLista.size()) {
                        cadenaLista.remove(posicionEliminar);
                    } else {
                        System.out.println("La posición de eliminación no es válida");
                    }
                    break;
                case "mostrar":
                    System.out.println("Cadenas de caracteres en la lista:");
                    for (int i = 0; i < cadenaLista.size(); i++) {
                        System.out.printf("%d: %s%n", i, cadenaLista.get(i));
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