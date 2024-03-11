package assuresoft.com.sciencemuseum2.systems.reproductive;

import assuresoft.com.sciencemuseum2.interfaces.ReproductiveSystem;

public class AsexualReproduction implements ReproductiveSystem {

    @Override
    public void reproduce() {
        System.out.println("\tAsexually reproducing...");
    }

    public void cellularDivision(){
        System.out.println("Reproduction through the division of a single cell into two identical daughter cells.");
    }

    public void gemmation(){
        System.out.println("Reproduction through the formation of a small bud or outgrowth, which detaches to become a new organism.");
    }
}
