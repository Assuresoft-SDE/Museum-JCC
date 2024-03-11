package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class IntegumentaryRespiration implements RespiratorySystem {
    @Override
    public void getOxygen() {
        System.out.println("Extracting oxygen through the skin.");
    }

    @Override
    public void transportOxygen() {
        System.out.println("Transporting oxygen through the skin to cells.");
    }

    @Override
    public void gasExchange() {
        System.out.println("Exchanging gases through the skin surface.");
    }

    @Override
    public void co2Elimination() {
        System.out.println("Eliminating carbon dioxide through the skin.");
    }
}
