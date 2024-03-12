package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.Animal;
import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;

import java.util.List;

public class Dolphin extends Animal {

    public Dolphin(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    public Dolphin(String scientificName, String commonName, String gender) {
        super();

        AnimalData dolphinData = new AnimalData(scientificName, commonName, "Delphinidae", gender);
        List<Sensors> dolphinSensors = List.of(Sensors.Hearing, Sensors.Vision, Sensors.Touch, Sensors.Echolocation, Sensors.Taste);
        AnimalSystems dolphinSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(), dolphinSensors, new CarnivorousDigestion());

        super.setAnimalData(dolphinData);
        super.setAnimalSystems(dolphinSystems);
    }
}
