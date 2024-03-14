package assuresoft.com.sciencemuseum2.systems.digestive;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;

public class HerbivorousDigestion implements DigestiveSystem {

    @Override
    public void intake() {
        displayMessage("Consuming plant material.");
    }

    @Override
    public void mechanicalDigestion() {
        displayMessage("Grinding plant material using molars or other specialized teeth.");
    }

    @Override
    public void chemicalDigestion() {
        displayMessage("Breaking down plant material with enzymes in the stomach and intestines.");
    }

    @Override
    public void nutrientAbsorption() {
        displayMessage("Absorbing nutrients from digested plant material in the small intestine.");
    }

    @Override
    public void fecalMatterElimination() {
        displayMessage("Excreting undigested plant matter as feces.");
    }
}
