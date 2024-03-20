package assuresoft.com.sciencemuseum2.systems.digestive;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;

public class OmnivorousDigestion implements DigestiveSystem {
    @Override
    public String intake() {
        return formatMessage("Consuming a variety of plant and animal-based foods.");
    }

    @Override
    public String mechanicalDigestion() {
        return formatMessage("Chewing and breaking down food using teeth.");
    }

    @Override
    public String chemicalDigestion() {
        return formatMessage("Digesting food using a combination of stomach acids and enzymes.");
    }

    @Override
    public String nutrientAbsorption() {
        return formatMessage("Absorbing nutrients from digested food in the small intestine.");
    }

    @Override
    public String fecalMatterElimination() {
        return formatMessage("Eliminating undigested waste as feces.");
    }
}
