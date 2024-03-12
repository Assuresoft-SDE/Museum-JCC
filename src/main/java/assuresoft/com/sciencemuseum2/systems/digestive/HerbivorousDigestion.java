package assuresoft.com.sciencemuseum2.systems.digestive;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;

public class HerbivorousDigestion implements DigestiveSystem {

    @Override
    public void intake() {
        System.out.println("Consuming plant material.");
    }

    @Override
    public void mechanicalDigestion() {
        System.out.println("Grinding plant material using molars or other specialized teeth.");
    }

    @Override
    public void chemicalDigestion() {
        System.out.println("Breaking down plant material with enzymes in the stomach and intestines.");
    }

    @Override
    public void nutrientAbsorption() {
        System.out.println("Absorbing nutrients from digested plant material in the small intestine.");
    }

    @Override
    public void fecalMatterElimination() {
        System.out.println("Excreting undigested plant matter as feces.");
    }
}
