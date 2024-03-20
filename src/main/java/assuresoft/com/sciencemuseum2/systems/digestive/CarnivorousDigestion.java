package assuresoft.com.sciencemuseum2.systems.digestive;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;

public class CarnivorousDigestion implements DigestiveSystem {
    @Override
    public String intake() {
        return formatMessage("Consuming meat or animal products.");
    }

    @Override
    public String mechanicalDigestion() {
        return formatMessage("Chewing or breaking down meat using teeth.");
    }

    @Override
    public String chemicalDigestion() {
        return formatMessage("Digesting meat using stomach acids and enzymes.");
    }

    @Override
    public String nutrientAbsorption() {
        return formatMessage("Absorbing nutrients from digested meat in the small intestine.");
    }

    @Override
    public String fecalMatterElimination() {
        return formatMessage("Eliminating undigested waste as feces.");
    }
}
