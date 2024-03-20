package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.Animal;
import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.OmnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.GillsRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;
import java.util.List;

public class Catfish extends Animal {
    /**
     * @param animalSystems (AnimalSystems) The animal body systems associated with the catfish.
     * @param animalData    (AnimalData) The information associated with the catfish.
     */
    public Catfish(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    /**
     * @param scientificName (String) The scientific name of the catfish.
     * @param commonName     (String) The common name of the catfish.
     * @param gender         (String) The gender of the catfish.
     */
    public Catfish(String scientificName, String commonName, String gender) {
        AnimalData catfishData = new AnimalData(scientificName, commonName, "Siluridae", gender);
        List<Sensors> catfishSensors = List.of(Sensors.Vision, Sensors.Smell, Sensors.Touch, Sensors.Taste);
        AnimalSystems catfishSystems = new AnimalSystems(new GillsRespiration(), new SexualReproduction(), catfishSensors, new OmnivorousDigestion());

        super.setAnimalData(catfishData);
        super.setAnimalSystems(catfishSystems);
    }
}
