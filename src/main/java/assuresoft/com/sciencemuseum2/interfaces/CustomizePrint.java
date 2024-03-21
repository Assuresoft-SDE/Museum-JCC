package assuresoft.com.sciencemuseum2.interfaces;

public interface CustomizePrint {
    String TABULATION = "\t- ";
    default String formatMessage(String message){
        return TABULATION + message;
    }
}
