package assuresoft.com.sciencemuseum2.systems.reproductive;

import assuresoft.com.sciencemuseum2.interfaces.ReproductiveSystem;

public class AsexualReproduction implements ReproductiveSystem {
    private static final String LINE_BREAK = "\n";

    @Override
    public String reproduce() {
        return cellularDivision() + LINE_BREAK +
        gemmation() + LINE_BREAK;
    }

    public String cellularDivision(){
        return formatMessage("Reproduction through the division of a single cell into two identical daughter cells.");
    }

    public String gemmation(){
        return formatMessage("Reproduction through the formation of a small bud or outgrowth, which detaches to become a new organism.");
    }
}
