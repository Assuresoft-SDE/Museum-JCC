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
    /**
     * @param animalSystems (AnimalSystems) The animal body systems associated with the bat.
     * @param animalData    (AnimalData) The information associated with the bat.
     */
    public Bat(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    /**
     * @param scientificName (String) The scientific name of the bat.
     * @param commonName     (String) The common name of the bat.
     * @param gender         (String) The gender of the bat.
     */
    public Bat(String scientificName, String commonName, String gender) {
        AnimalData batData = new AnimalData(scientificName, commonName, "Microchiroptera", gender);
        List<Sensors> batSensors = List.of(Sensors.Vision, Sensors.Smell, Sensors.Echolocation);
        AnimalSystems batSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(), batSensors, new CarnivorousDigestion());

        super.setAnimalData(batData);
        super.setAnimalSystems(batSystems);
    }
}
