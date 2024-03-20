package assuresoft.com.sciencemuseum2.interfaces;

public interface CustomizePrint {
    default String formatMessage(String message){
        return "\t- " + message;
    }
}
