package assuresoft.com.sciencemuseum2.systems.reproductive;

import assuresoft.com.sciencemuseum2.interfaces.ReproductiveSystem;

public class SexualReproduction implements ReproductiveSystem {

    @Override
    public void reproduce() {
        displayMessage("\tSexually reproducing...");
    }

    public void mating() {
        displayMessage("The process of individuals coming together to exchange genetic material.");
    }

    public void fertilization() {
        displayMessage("The fusion of gametes (sperm and egg) to form a zygote, which develops into a new organism.");
    }
}
