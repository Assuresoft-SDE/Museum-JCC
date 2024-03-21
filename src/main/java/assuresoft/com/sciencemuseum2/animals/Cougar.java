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
    private static final String COUGAR_FAMILY = "Felidae";


    public Cougar(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    public Cougar(String scientificName, String commonName, String gender, String coatColor) {
        AnimalData cougarData = new AnimalData(scientificName, commonName, COUGAR_FAMILY, gender);
        List<Sensors> cougarSensors = List.of(Sensors.HEARING, Sensors.VISION, Sensors.SMELL, Sensors.TOUCH, Sensors.TASTE);
        AnimalSystems cougarSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(), cougarSensors, new CarnivorousDigestion());
        this.coatColor = coatColor;
        super.setAnimalData(cougarData);
        super.setAnimalSystems(cougarSystems);
    }


    @Override
    public String getAnimalInformation() {
        return super.getAnimalInformation() +
                "Coat Color: " + coatColor;
    }
}
