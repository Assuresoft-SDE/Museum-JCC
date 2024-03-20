package assuresoft.com.sciencemuseum2.interfaces;

public interface CustomizePrint {
    /**
     * @param message The message to be displayed.
     */
    default public void displayMessage(String message){
        System.out.println("\t- " + message);
    }
}
