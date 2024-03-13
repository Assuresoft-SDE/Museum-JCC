package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class TrachealRespiration implements RespiratorySystem {
    @Override
    public void getOxygen() {
        displayMessage("Absorbing oxygen directly through tracheal tubes.");
    }

    @Override
    public void transportOxygen() {
        displayMessage("Transporting oxygen through tracheal system to cells.");
    }

    @Override
    public void gasExchange() {
        displayMessage("Exchanging gases between tracheoles and body cells.");
    }

    @Override
    public void co2Elimination() {
        displayMessage("Releasing carbon dioxide through tracheal system.");
    }
}
