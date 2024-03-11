package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class TrachealRespiration implements RespiratorySystem {
    @Override
    public void getOxygen() {
        System.out.println("Absorbing oxygen directly through tracheal tubes.");
    }

    @Override
    public void transportOxygen() {
        System.out.println("Transporting oxygen through tracheal system to cells.");
    }

    @Override
    public void gasExchange() {
        System.out.println("Exchanging gases between tracheoles and body cells.");
    }

    @Override
    public void co2Elimination() {
        System.out.println("Releasing carbon dioxide through tracheal system.");
    }
}
