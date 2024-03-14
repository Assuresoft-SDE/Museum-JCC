package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class LungRespiration implements RespiratorySystem {
    @Override
    public void getOxygen() {
        displayMessage("Inhaling oxygen from the environment.");
    }

    @Override
    public void transportOxygen() {
        displayMessage("Transporting oxygen through the bloodstream via lungs.");
    }

    @Override
    public void gasExchange() {
        displayMessage("Exchanging gases between alveoli and blood capillaries.");
    }

    @Override
    public void co2Elimination() {
        displayMessage("Eliminating carbon dioxide by exhaling.");
    }
}
