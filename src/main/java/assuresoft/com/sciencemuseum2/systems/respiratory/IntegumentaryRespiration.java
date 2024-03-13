package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class IntegumentaryRespiration implements RespiratorySystem {
    @Override
    public void getOxygen() {
        displayMessage("Extracting oxygen through the skin.");
    }

    @Override
    public void transportOxygen() {
        displayMessage("Transporting oxygen through the skin to cells.");
    }

    @Override
    public void gasExchange() {
        displayMessage("Exchanging gases through the skin surface.");
    }

    @Override
    public void co2Elimination() {
        displayMessage("Eliminating carbon dioxide through the skin.");
    }
}
