import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Venta {
    String producto;
    String cliente;
    double precio;
    LocalDate fecha;

    public Venta(String producto, String cliente, double precio, String fecha) {
        this.producto = producto;
        this.cliente = cliente;
        this.precio = precio;
        this.fecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public String toString() {
        return "Venta{" +
                "producto='" + producto + '\'' +
                ", cliente='" + cliente + '\'' +
                ", precio=" + precio +
                ", fecha=" + fecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +
                '}';
    }
}

public class EJ10 {

    public static void main(String[] args) {
        TreeSet<Venta> ventas = new TreeSet<>(Comparator.comparing(venta -> venta.fecha)
                .thenComparing(venta -> venta.cliente)
                .thenComparing(venta -> venta.precio));
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("Introduce una opción (insertar, listar, salir):");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "insertar":
                    System.out.print("Introduce el producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Introduce el cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Introduce el precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Introduce la fecha (yyyy-MM-dd): ");
                    String fecha = scanner.nextLine();
                    ventas.add(new Venta(producto, cliente, precio, fecha));
                    break;
                case "listar":
                    System.out.println("Ventas:");
                    for (Venta venta : ventas) {
                        System.out.println(venta);
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