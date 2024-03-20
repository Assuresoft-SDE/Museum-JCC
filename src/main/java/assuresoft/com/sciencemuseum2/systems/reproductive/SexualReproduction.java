package assuresoft.com.sciencemuseum2.systems.reproductive;

import assuresoft.com.sciencemuseum2.interfaces.ReproductiveSystem;

public class SexualReproduction implements ReproductiveSystem {
    private static final String LINE_BREAK = "\n";

    @Override
    public String reproduce() {
        return mating() + LINE_BREAK +
                fertilization() + LINE_BREAK;
    }

    public String mating() {
        return formatMessage("The process of individuals coming together to exchange genetic material.");
    }

    public String fertilization() {
        return formatMessage("The fusion of gametes (sperm and egg) to form a zygote, which develops into a new organism.");
    }
}
