package assuresoft.com.sciencemuseum2.interfaces;

public interface CustomizePrint {
    /**
     * @param message The message to be displayed.
     * @return The formatted message with indentation.
     */
    default String formatMessage(String message){
        return "\t- " + message;
    }
}
