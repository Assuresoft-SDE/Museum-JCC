package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.Animal;
import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;
import java.util.List;

public class Bat extends Animal {
    private static final String BAT_FAMILY = "Microchiroptera";


    public Bat(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    public Bat(String scientificName, String commonName, String gender) {
        AnimalData batData = new AnimalData(scientificName, commonName, BAT_FAMILY, gender);
        List<Sensors> batSensors = List.of(Sensors.VISION, Sensors.SMELL, Sensors.ECHOLOCATION);
        AnimalSystems batSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(), batSensors, new CarnivorousDigestion());

        super.setAnimalData(batData);
        super.setAnimalSystems(batSystems);
    }
}
