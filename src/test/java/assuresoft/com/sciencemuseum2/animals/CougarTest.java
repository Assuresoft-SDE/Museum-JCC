package assuresoft.com.sciencemuseum2.animals;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CougarTest extends TestCase {

    public void testGetAnimalInformation() {
        Cougar animal = new Cougar("Felis catus", "Domestic Cat", "Female", "White and brown");

        // Redirigir la salida estándar para poder capturarla y compararla
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        animal.getAnimalInformation();

        // Restaurar la salida estándar
        System.setOut(System.out);

        String expectedOutput = "Animal Information\r\n" +
                "Scientific Name: Felis catus\r\n" +
                "Common Name: Domestic Cat\r\n" +
                "Family: Felidae\r\n" +
                "Gender: Female\r\n" +
                "Coat Color: White and brown\r\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}