package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class GillsRespiration implements RespiratorySystem {
    @Override
    public void getOxygen() {
        displayMessage("Absorbing oxygen from water through gills.");
    }

    @Override
    public void transportOxygen() {
        displayMessage("Transporting oxygen through the bloodstream via gills.");
    }

    @Override
    public void gasExchange() {
        displayMessage("Exchanging gases between water and blood in gill capillaries.");
    }

    @Override
    public void co2Elimination() {
        displayMessage("Releasing carbon dioxide into the water through gills.");
    }
}
