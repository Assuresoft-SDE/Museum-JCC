package assuresoft.com.sciencemuseum2.systems.digestive;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;

public class CarnivorousDigestion implements DigestiveSystem {
    @Override
    public void intake() {
        displayMessage("Consuming meat or animal products.");
    }

    @Override
    public void mechanicalDigestion() {
        displayMessage("Chewing or breaking down meat using teeth.");
    }

    @Override
    public void chemicalDigestion() {
        displayMessage("Digesting meat using stomach acids and enzymes.");
    }

    @Override
    public void nutrientAbsorption() {
        displayMessage("Absorbing nutrients from digested meat in the small intestine.");
    }

    @Override
    public void fecalMatterElimination() {
        displayMessage("Eliminating undigested waste as feces.");
    }
}
