package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.*;

public class Execute {
    private static final String MALE_GENDER = "Male";
    private static final String FEMALE_GENDER = "Female";


    public static void main(String[] args) {
        StringBuilder animalsBehavior = new StringBuilder();

        Animal bat = new Bat("Chiroptera", "Bat", MALE_GENDER);
        animalsBehavior.append(bat.getAnimalInformation());
        animalsBehavior.append(bat.performLifeProcesses());

        Animal dolphin = new Dolphin("Delphinidae", "Dolphin", MALE_GENDER);
        animalsBehavior.append(dolphin.getAnimalInformation());
        animalsBehavior.append(dolphin.performLifeProcesses());

        Animal condor = new Condor("Vultur Gryphus", "Condor", FEMALE_GENDER);
        animalsBehavior.append(condor.getAnimalInformation());
        animalsBehavior.append(condor.performLifeProcesses());

        Animal cougar = new Cougar("Pumar concolor incarum", "Andean Cougar",
                MALE_GENDER, "Yellowish-brown with black spots and rosettes. ");
        animalsBehavior.append(cougar.getAnimalInformation());
        animalsBehavior.append(cougar.performLifeProcesses());

        Animal catfish = new Catfish("Siluriformes", "Catfish", MALE_GENDER);
        animalsBehavior.append(catfish.getAnimalInformation());
        animalsBehavior.append(catfish.performLifeProcesses());

        Animal wolf = new Wolf("Canis lupus","Wolf", MALE_GENDER,
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
