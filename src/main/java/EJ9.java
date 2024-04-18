import java.util.Scanner;
import java.util.TreeSet;

class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}

public class EJ9 {

    public static void main(String[] args) {
        TreeSet<Persona> personas = new TreeSet<>((p1, p2) -> p1.apellido.compareTo(p2.apellido));
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("Introduce una opción (insertar, eliminar, mostrar, salir):");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "insertar":
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el apellido: ");
                    String apellido = scanner.nextLine();
                    personas.add(new Persona(nombre, apellido));
                    break;
                case "mostrar":
                    System.out.println("Personas:");
                    for (Persona persona : personas) {
                        System.out.println(persona);
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