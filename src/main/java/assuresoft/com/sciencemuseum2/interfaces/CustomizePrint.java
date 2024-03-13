package assuresoft.com.sciencemuseum2.interfaces;

public interface CustomizePrint {
    default public void displayMessage( String message ){
        System.out.println("\t- " + message);
    }
}
