package assuresoft.com.sciencemuseum2.systems.digestive;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;

public class HerbivorousDigestion implements DigestiveSystem {
    @Override
    public String intake() {
        return formatMessage("Consuming plant material.");
    }

    @Override
    public String mechanicalDigestion() {
        return formatMessage("Grinding plant material using molars or other specialized teeth.");
    }

    @Override
    public String chemicalDigestion() {
        return formatMessage("Breaking down plant material with enzymes in the stomach and intestines.");
    }

    @Override
    public String nutrientAbsorption() {
        return formatMessage("Absorbing nutrients from digested plant material in the small intestine.");
    }

    @Override
    public String fecalMatterElimination() {
        return formatMessage("Excreting undigested plant matter as feces.");
    }
}
