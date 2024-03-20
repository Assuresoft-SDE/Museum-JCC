package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.Animal;
import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;
import java.util.List;

public class Cougar extends Animal {
    private String coatColor;
    /**
     * @param animalSystems (AnimalSystems) The animal body systems associated with the cougar.
     * @param animalData    (AnimalData) The information associated with the cougar.
     */
    public Cougar(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    /**
     * @param scientificName (String) The scientific name of the cougar.
     * @param commonName     (String) The common name of the cougar.
     * @param gender         (String) The gender of the cougar.
     * @param coatColor      (String) The fur of the cougar.
     */
    public Cougar(String scientificName, String commonName, String gender, String coatColor) {
        AnimalData cougarData = new AnimalData(scientificName, commonName, "Felidae", gender);
        List<Sensors> cougarSensors = List.of(Sensors.Hearing, Sensors.Vision, Sensors.Smell, Sensors.Touch, Sensors.Taste);
        AnimalSystems cougarSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(), cougarSensors, new CarnivorousDigestion());
        this.coatColor = coatColor;
        super.setAnimalData(cougarData);
        super.setAnimalSystems(cougarSystems);
    }


    @Override
    public void getAnimalInformation() {
        super.getAnimalInformation();
        System.out.println("Coat Color: " + coatColor);
    }
}
