package assuresoft.com.sciencemuseum2.systems.reproductive;

import assuresoft.com.sciencemuseum2.interfaces.ReproductiveSystem;

public class SexualReproduction implements ReproductiveSystem {

    @Override
    public void reproduce() {
        System.out.println("\tSexually reproducing...");
    }

    public void mating() {
        System.out.println("The process of individuals coming together to exchange genetic material.");
    }

    public void fertilization() {
        System.out.println("The fusion of gametes (sperm and egg) to form a zygote, which develops into a new organism.");
    }
}
