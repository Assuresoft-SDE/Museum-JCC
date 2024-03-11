package assuresoft.com.sciencemuseum2.systems.respiratory;

import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public class LungRespiration implements RespiratorySystem {
    @Override
    public void getOxygen() {
        System.out.println("Inhaling oxygen from the environment.");
    }

    @Override
    public void transportOxygen() {
        System.out.println("Transporting oxygen through the bloodstream via lungs.");
    }

    @Override
    public void gasExchange() {
        System.out.println("Exchanging gases between alveoli and blood capillaries.");
    }

    @Override
    public void co2Elimination() {
        System.out.println("Eliminating carbon dioxide by exhaling.");
    }
}
