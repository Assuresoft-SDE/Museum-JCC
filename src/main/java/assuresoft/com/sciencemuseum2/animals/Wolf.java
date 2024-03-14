package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.Animal;
import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;
import java.util.List;

public class Wolf extends Animal {

    private String coatColor;
    private boolean isAlpha;
    private List<Wolf> wolfPackMembers;

    public Wolf(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }

    public Wolf(String scientificName, String commonName, String gender, String coatColor, boolean isAlpha) {
        AnimalData wolfData = new AnimalData(scientificName, commonName, "Canidae", gender);
        List<Sensors> wolfSensors = List.of(Sensors.Hearing, Sensors.Vision, Sensors.Smell, Sensors.Touch, Sensors.Taste);
        AnimalSystems wolfSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(), wolfSensors, new CarnivorousDigestion());
        this.coatColor = coatColor;
        this.isAlpha = isAlpha;
        super.setAnimalData(wolfData);
        super.setAnimalSystems(wolfSystems);
    }


    @Override
    public void getAnimalInformation() {
        super.getAnimalInformation();
        System.out.println("Coat Color: " + coatColor);
        System.out.println("Alpha: " + (isAlpha ? "Yes" : "No"));
    }

    public void formWolfPack() {
        //TODO: complete this method.
    }
}
