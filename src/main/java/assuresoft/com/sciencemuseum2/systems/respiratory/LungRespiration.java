package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class LungRespiration implements RespiratorySystem {
    @Override
    public String getOxygen() {
        return formatMessage("Inhaling oxygen from the environment.");
    }

    @Override
    public String transportOxygen() {
        return formatMessage("Transporting oxygen through the bloodstream via lungs.");
    }

    @Override
    public String gasExchange() {
        return formatMessage("Exchanging gases between alveoli and blood capillaries.");
    }

    @Override
    public String co2Elimination() {
        return formatMessage("Eliminating carbon dioxide by exhaling.");
    }
}
