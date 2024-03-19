package assuresoft.com.sciencemuseum2.systems.digestive;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;

public class OmnivorousDigestion implements DigestiveSystem {
    @Override
    public void intake() {
        displayMessage("Consuming a variety of plant and animal-based foods.");
    }

    @Override
    public void mechanicalDigestion() {
        displayMessage("Chewing and breaking down food using teeth.");
    }

    @Override
    public void chemicalDigestion() {
        displayMessage("Digesting food using a combination of stomach acids and enzymes.");
    }

    @Override
    public void nutrientAbsorption() {
        displayMessage("Absorbing nutrients from digested food in the small intestine.");
    }

    @Override
    public void fecalMatterElimination() {
        displayMessage("Eliminating undigested waste as feces.");
    }
}
