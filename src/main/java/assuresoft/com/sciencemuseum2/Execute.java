package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.*;

public class Execute {
    public static void main(String[] args) {
        StringBuilder animalsBehavior = new StringBuilder();

        Animal bat = new Bat("Chiroptera", "Bat", "Male");
        animalsBehavior.append(bat.getAnimalInformation());
        animalsBehavior.append(bat.performLifeProcesses());

        Animal dolphin = new Dolphin("Delphinidae", "Dolphin", "Male");
        animalsBehavior.append(dolphin.getAnimalInformation());
        animalsBehavior.append(dolphin.performLifeProcesses());

        Animal condor = new Condor("Vultur Gryphus", "Condor", "Male");
        animalsBehavior.append(condor.getAnimalInformation());
        animalsBehavior.append(condor.performLifeProcesses());

        Animal cougar = new Cougar("Pumar concolor incarum", "Andean Cougar",
                "Male", "Yellowish-brown with black spots and rosettes. ");
        animalsBehavior.append(cougar.getAnimalInformation());
        animalsBehavior.append(cougar.performLifeProcesses());

        Animal catfish = new Catfish("Siluriformes", "Catfish", "Male");
        animalsBehavior.append(catfish.getAnimalInformation());
        animalsBehavior.append(catfish.performLifeProcesses());

        Animal wolf = new Wolf("Canis lupus","Wolf", "Male",
                "White", WolfRole.EXPLORER);
        animalsBehavior.append(wolf.getAnimalInformation());
        animalsBehavior.append(wolf.performLifeProcesses());

        int tentaclesNumber = 100;
        int sizeInCm = 300;
        Animal jellyfish = new Jellyfish("Aurelia aurita", "Moon Jellyfish",
                "Hermaphroditic", tentaclesNumber, sizeInCm);
        animalsBehavior.append(jellyfish.getAnimalInformation());
        animalsBehavior.append(jellyfish.performLifeProcesses());

        System.out.println(animalsBehavior.toString());
    }
}
