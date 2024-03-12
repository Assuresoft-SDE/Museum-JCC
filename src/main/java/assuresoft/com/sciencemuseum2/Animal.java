package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;
import assuresoft.com.sciencemuseum2.interfaces.ReproductiveSystem;
import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;

public abstract class Animal {
    private final AnimalSystems animalSystems;
    private final AnimalData animalData;

    public Animal(AnimalSystems animalSystems, AnimalData animalData) {
        this.animalSystems = animalSystems;
        this.animalData = animalData;
    }


    public void translation() {
        System.out.println(this.animalData.getCommonName() + " is moving...");
    }

    public void sleep() {
        System.out.println(this.animalData.getCommonName() + " is sleeping...");
    }

    public void eat() {
        System.out.println("Starting to eat:");
        this.animalSystems.executeEatingProcess();
        System.out.println("Finished digestion.\n");
    }

    public void breathe() {
        System.out.println("Starting to breath:");
        this.animalSystems.executeBreathingProcess();
        System.out.println("Finished breathing.\n");
    }

    public void reproduce() {
        System.out.println("Starting to reproduce:");
        this.animalSystems.executeReproductionProcess();
        System.out.println("Finished reproducing.\n");
    }

    public void checkEnvironment() {
        System.out.println("Checking environment with the following sensors:");
        animalSystems.checkEnvironment();
        System.out.println("Finished checking environment.\n");
    }
}
