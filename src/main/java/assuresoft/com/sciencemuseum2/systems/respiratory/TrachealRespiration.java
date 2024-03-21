package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class TrachealRespiration implements RespiratorySystem {
    @Override
    public String getOxygen() {
        return formatMessage("Absorbing oxygen directly through tracheal tubes.");
    }

    @Override
    public String transportOxygen() {
        return formatMessage("Transporting oxygen through tracheal system to cells.");
    }

    @Override
    public String gasExchange() {
        return formatMessage("Exchanging gases between tracheoles and body cells.");
    }

    @Override
    public String co2Elimination() {
        return formatMessage("Releasing carbon dioxide through tracheal system.");
    }
}
