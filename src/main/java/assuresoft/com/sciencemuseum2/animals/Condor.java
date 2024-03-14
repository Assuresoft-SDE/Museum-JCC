package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.Animal;
import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;

import java.util.List;

public class Condor extends Animal {

    private String coatColor;

    public Condor(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    public Condor(String scientificName, String commonName, String gender) {
        AnimalData condorData = new AnimalData(scientificName, commonName, "Cathartidae", gender);
        List<Sensors> condorSensors = List.of(Sensors.Vision, Sensors.Smell, Sensors.Touch);
        AnimalSystems condorSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(), condorSensors, new CarnivorousDigestion());

        super.setAnimalData(condorData);
        super.setAnimalSystems(condorSystems);
    }
}
