package assuresoft.com.sciencemuseum2.systems.digestive;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;

public class OmnivorousDigestion implements DigestiveSystem {

    @Override
    public void intake() {
        System.out.println("Consuming a variety of plant and animal-based foods.");
    }

    @Override
    public void mechanicalDigestion() {
        System.out.println("Chewing and breaking down food using teeth.");
    }

    @Override
    public void chemicalDigestion() {
        System.out.println("Digesting food using a combination of stomach acids and enzymes.");
    }

    @Override
    public void nutrientAbsorption() {
        System.out.println("Absorbing nutrients from digested food in the small intestine.");
    }

    @Override
    public void fecalMatterElimination() {
        System.out.println("Eliminating undigested waste as feces.");
    }
}
