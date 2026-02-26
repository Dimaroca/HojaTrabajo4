import CalculatorComponents.CalculatorVector;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


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
        String input = Files.readString(Path.of("Resources/datos.txt"));
        CalculatorVector calc = new CalculatorVector();
        System.out.print("Se ha creado un archivo llamado resultado de tipo .txt con la respuesta");
        Files.writeString(Path.of("Resources/resultado.txt"), String.valueOf(calc.Operate(input)));
        
    }
}