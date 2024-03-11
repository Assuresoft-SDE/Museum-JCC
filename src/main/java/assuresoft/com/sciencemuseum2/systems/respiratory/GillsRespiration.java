package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class GillsRespiration implements RespiratorySystem {
    @Override
    public void getOxygen() {
        System.out.println("Absorbing oxygen from water through gills.");
    }

    @Override
    public void transportOxygen() {
        System.out.println("Transporting oxygen through the bloodstream via gills.");
    }

    @Override
    public void gasExchange() {
        System.out.println("Exchanging gases between water and blood in gill capillaries.");
    }

    @Override
    public void co2Elimination() {
        System.out.println("Releasing carbon dioxide into the water through gills.");
    }
}
