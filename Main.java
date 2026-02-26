import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import StackElements.StackFactory;

/**
 * Main entry point of the application.
 * <p>
 * This class reads a mathematical expression from a text file,
 * evaluates it using the {@link CalculatorVector} class, and writes
 * the result to an output file.
 * </p>
 */

public class Main {

    public static void main(String[] args) throws IOException {

        String input = Files.readString(Path.of("Resources/datos.txt")).trim();

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el tipo de lista:");
        System.out.println("1) Vector");
        System.out.println("2) ArrayList");
        System.out.println("3) Lista Simple");
        System.out.println("4) Lista Doble");
        int type = sc.nextInt();

        double result = StackFactory.createStack(type, input);

        Files.writeString(Path.of("Resources/resultado.txt"), String.valueOf(result));

        System.out.println("Se ha creado un archivo llamado resultado.txt con la respuesta");
    }
}