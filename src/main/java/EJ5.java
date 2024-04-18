import java.util.LinkedList;
import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {
        LinkedList<String> cadenaLista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("Introduce una opción (insertar, eliminar, mostrar, salir):");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "insertar":
                    System.out.print("Introduce la posición: ");
                    int posicion = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    if (posicion >= 0 && posicion <= cadenaLista.size()) {
                        System.out.print("Introduce la cadena de caracteres: ");
                        String cadena = scanner.nextLine();
                        cadenaLista.add(posicion, cadena);
                    } else {
                        System.out.println("La posición de inserción debe ser entre 0 y " + cadenaLista.size());
                    }
                    break;
                case "eliminar":
                    System.out.print("Introduce la posición: ");
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






