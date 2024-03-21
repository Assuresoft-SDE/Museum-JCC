package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class GillsRespiration implements RespiratorySystem {
    @Override
    public String getOxygen() {
        return formatMessage("Absorbing oxygen from water through gills.");
    }

    @Override
    public String transportOxygen() {
        return formatMessage("Transporting oxygen through the bloodstream via gills.");
    }

    @Override
    public String gasExchange() {
        return formatMessage("Exchanging gases between water and blood in gill capillaries.");
    }

    @Override
    public String co2Elimination() {
        return formatMessage("Releasing carbon dioxide into the water through gills.");
    }
}
