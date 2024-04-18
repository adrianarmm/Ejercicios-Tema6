import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class EJ11 {

    public static void main(String[] args) {
        String inputFilePath = "/Users/adrianareyesmorera/Desktop/TARTAS-QUESO.txt";
        String outputFilePath = "output.txt";

        try {
            // Leer todas las líneas del archivo de entrada
            List<String> lines = Files.readAllLines(Paths.get(inputFilePath));

            // Ordenar las líneas
            Collections.sort(lines);

            // Otra forma de hacer la ordenación es usar el método sort de List
            // lines.sort(String::compareTo);

            // Escribir las líneas ordenadas en el archivo de salida
            Files.write(Paths.get(outputFilePath), lines);

            System.out.println("Archivo ordenado y guardado exitosamente.");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer o escribir los archivos:");
            e.printStackTrace();
        }
    }
}
