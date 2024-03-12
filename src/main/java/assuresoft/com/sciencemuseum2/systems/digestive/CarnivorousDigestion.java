package assuresoft.com.sciencemuseum2.systems.digestive;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;

public class CarnivorousDigestion implements DigestiveSystem {

    @Override
    public void intake() {
        System.out.println("intake(): Consuming meat or animal products.");
    }

    @Override
    public void mechanicalDigestion() {
        System.out.println("Chewing or breaking down meat using teeth.");
    }

    @Override
    public void chemicalDigestion() {
        System.out.println("Digesting meat using stomach acids and enzymes.");
    }

    @Override
    public void nutrientAbsorption() {
        System.out.println("Absorbing nutrients from digested meat in the small intestine.");
    }

    @Override
    public void fecalMatterElimination() {
        System.out.println("Eliminating undigested waste as feces.");
    }
}
