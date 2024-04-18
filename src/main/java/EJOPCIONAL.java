import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EJOPCIONAL {

    private static List<String> nombresDeArchivos = new ArrayList<>();
    private static List<String> rutasDeArchivos = new ArrayList<>();

    public static void main(String[] args) {
        indexarArchivos("/Users/adrianareyesmorera/Desktop/");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el nombre de un archivo para buscar, o escriba 'salir' para salir:");
            String entrada = scanner.nextLine();

            if ("salir".equalsIgnoreCase(entrada)) {
                break;
            }

            int indice = nombresDeArchivos.indexOf(entrada);

            if (indice != -1) {
                System.out.println("El archivo '" + entrada + "' se encuentra en: " + rutasDeArchivos.get(indice));
            } else {
                System.out.println("Archivo no encontrado.");
            }
        }

        scanner.close();
    }

    private static void indexarArchivos(String rutaDelDirectorio) {
        File directorio = new File(rutaDelDirectorio);

        // Verifica si el directorio existe y es un directorio
        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("La ruta proporcionada no existe o no es un directorio: " + rutaDelDirectorio);
            return;
        }

        File[] archivos = directorio.listFiles();

        // Comprobación de null para evitar NullPointerException
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    nombresDeArchivos.add(archivo.getName());
                    rutasDeArchivos.add(archivo.getAbsolutePath());
                } else if (archivo.isDirectory()) {
                    indexarArchivos(archivo.getAbsolutePath());
                }
            }
        }

        nombresDeArchivos.sort(Comparator.naturalOrder());

        for (int i = 0; i < nombresDeArchivos.size(); i++) {
            System.out.println(nombresDeArchivos.get(i) + " - " + rutasDeArchivos.get(i));
        }
    }
}
