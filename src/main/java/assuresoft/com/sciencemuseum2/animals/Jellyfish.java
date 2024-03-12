package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.Animal;
import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.IntegumentaryRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;

import java.util.List;

public class Jellyfish extends Animal {

    private int numberOfTentacles;
    private int tentacleLengthCm;

    public Jellyfish(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    public Jellyfish(String scientificName, String commonName, String gender) {
        super();

        AnimalData jellyfishData = new AnimalData(scientificName, commonName, "Cnidaria", gender);
        List<Sensors> jellyfishSensors = List.of(Sensors.Cell);
        AnimalSystems jellyfishSystems = new AnimalSystems(new IntegumentaryRespiration(), new SexualReproduction(), jellyfishSensors, new CarnivorousDigestion());

        super.setAnimalData(jellyfishData);
        super.setAnimalSystems(jellyfishSystems);
    }
}
