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
    private static final String DOLPHIN_FAMILY = "Delphinidae";


    public Dolphin(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    public Dolphin(String scientificName, String commonName, String gender) {
        AnimalData dolphinData = new AnimalData(scientificName, commonName, DOLPHIN_FAMILY, gender);
        List<Sensors> dolphinSensors = List.of(Sensors.HEARING, Sensors.VISION, Sensors.TOUCH, Sensors.ECHOLOCATION, Sensors.TASTE);
        AnimalSystems dolphinSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(), dolphinSensors, new CarnivorousDigestion());

        super.setAnimalData(dolphinData);
        super.setAnimalSystems(dolphinSystems);
    }
}
