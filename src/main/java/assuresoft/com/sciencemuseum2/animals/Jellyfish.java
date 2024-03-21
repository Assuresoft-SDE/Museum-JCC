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
    /**
     * @param animalSystems (AnimalSystems) The animal body systems associated with the jellyfish.
     * @param animalData    (AnimalData) The information associated with the jellyfish.
     */
    public Jellyfish(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    /**
     * @param scientificName        (String) The scientific name of the jellyfish.
     * @param commonName            (String) The common name of the jellyfish.
     * @param gender                (String) The gender of the jellyfish.
     * @param numberOfTentacles     (int) The number of tentacles of the jellyfish.
     * @param tentacleLengthCm      (int) The size in centimeters of the jellyfish's tentacle.
     */
    public Jellyfish(String scientificName, String commonName, String gender, int numberOfTentacles, int tentacleLengthCm) {
        AnimalData jellyfishData = new AnimalData(scientificName, commonName, "Cnidaria", gender);
        List<Sensors> jellyfishSensors = List.of(Sensors.Cell);
        AnimalSystems jellyfishSystems = new AnimalSystems(new IntegumentaryRespiration(), new SexualReproduction(), jellyfishSensors, new CarnivorousDigestion());
        this.numberOfTentacles = numberOfTentacles;
        this.tentacleLengthCm = tentacleLengthCm;
        super.setAnimalData(jellyfishData);
        super.setAnimalSystems(jellyfishSystems);
    }


    @Override
    public String getAnimalInformation() {
        return super.getAnimalInformation() +
                "Number of Tentacles: " + numberOfTentacles +
                "Tentacles Length in Centimeters: " + tentacleLengthCm;
    }
}
