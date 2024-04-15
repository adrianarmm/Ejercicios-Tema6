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
                    System.out.print("Introduce la cadena de caracteres: ");
                    String cadena = scanner.nextLine();
                    cadenaLista.add(posicion, cadena);
                    break;
                case "eliminar":
                    System.out.print("Introduce la posición: ");
                    int posicionEliminar = scanner.nextInt();
                    cadenaLista.remove(posicionEliminar);
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







