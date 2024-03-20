package assuresoft.com.sciencemuseum2.interfaces;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CustomizePrintTest extends TestCase {

    public void testDisplayMessage() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        PrintStream standardOut = System.out;
        System.setOut(new PrintStream(outputStreamCaptor));


        CustomizePrint printer = new CustomizePrint() {};
        String message = "display a message!";
        printer.displayMessage(message);


        assertEquals("\t- display a message!\n", outputStreamCaptor.toString());


        System.setOut(standardOut);
    }
}