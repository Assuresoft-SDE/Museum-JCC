package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class IntegumentaryRespiration implements RespiratorySystem {
    @Override
    public String getOxygen() {
        return formatMessage("Extracting oxygen through the skin.");
    }

    @Override
    public String transportOxygen() {
        return formatMessage("Transporting oxygen through the skin to cells.");
    }

    @Override
    public String gasExchange() {
        return formatMessage("Exchanging gases through the skin surface.");
    }

    @Override
    public String co2Elimination() {
        return formatMessage("Eliminating carbon dioxide through the skin.");
    }
}
