package assuresoft.com.sciencemuseum2.interfaces;

public interface printMessage {
    public default void printcito(String message){
        System.out.println("    -&& " + message);
    }
}
