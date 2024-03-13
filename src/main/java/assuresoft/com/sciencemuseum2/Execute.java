package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.*;

public class Execute {
    public static void main(String[] args) {
        Animal bat = new Bat("Chiroptera", "Bat", "Male");
        bat.getAnimalInformation();
        bat.performLifeProcesses();

        Animal dolphin = new Dolphin("Delphinidae", "Dolphin", "Male");
        dolphin.getAnimalInformation();
        dolphin.performLifeProcesses();

        Animal condor = new Condor("Vultur Gryphus", "Condor", "Male");
        condor.getAnimalInformation();
        condor.performLifeProcesses();

        Animal cougar = new Cougar("Pumar concolor incarum", "Andean Cougar","Male", "Yellowish-brown with black spots and rosettes. ");
        cougar.getAnimalInformation();
        cougar.performLifeProcesses();

        Animal catfish = new Catfish("Siluriformes", "Catfish", "Male");
        catfish.getAnimalInformation();
        catfish.performLifeProcesses();

        Animal wolf = new Wolf("Canis lupus","Wolf", "Male", "White", false);
        wolf.getAnimalInformation();
        wolf.performLifeProcesses();

        Animal jellyfish = new Jellyfish("Aurelia aurita", "Moon Jellyfish", "Hermaphroditic", 100, 300);
        jellyfish.getAnimalInformation();
        jellyfish.performLifeProcesses();

    }
}
