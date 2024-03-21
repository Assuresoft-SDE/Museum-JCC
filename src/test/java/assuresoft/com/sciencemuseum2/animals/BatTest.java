package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;

public class BatTest extends TestCase {
    private AnimalSystems mockedSystems;
    private AnimalData mockedData;

    @Before
    public void init(){
        mockedSystems = mock(AnimalSystems.class);
        mockedData = mock(AnimalData.class);
    }

    @Test
    public void testBatConstructorWithParameters() {
        Bat bat = new Bat(mockedSystems, mockedData);

        assertEquals(mockedData, bat.getAnimalData());
        assertEquals(mockedSystems, bat.getAnimalSystems());
    }

    @Test
    public void testBatConstructorWithArguments() {
        String scientificName = "BatScientificName";
        String commonName = "BatCommonName";
        String gender = "Male";
        Bat bat = new Bat(scientificName, commonName, gender);

        AnimalData batData = bat.getAnimalData();

        assertEquals(scientificName, batData.getScientificName());
        assertEquals(commonName, batData.getCommonName());
        assertEquals(gender, batData.getGender());
    }

    @Test
    public void testBatConstructorWithCorrectSystems() {
        List<Sensors> mockedSensors = List.of(Sensors.Vision, Sensors.Smell, Sensors.Echolocation);
        CarnivorousDigestion mockedDigestion = mock(CarnivorousDigestion.class);
        LungRespiration mockedRespiration = mock(LungRespiration.class);
        SexualReproduction mockedReproduction = mock(SexualReproduction.class);

        String scientificName = "BatScientificName";
        String commonName = "BatCommonName";
        String gender = "Male";
        Bat bat = new Bat(scientificName, commonName, gender);

        AnimalSystems batSystems = bat.getAnimalSystems();

        // Asserting that AnimalSystems are set properly
        assertEquals(mockedSensors, batSystems.getSensors());
        assertEquals(mockedRespiration, batSystems.getRespiration());
        assertEquals(mockedReproduction, batSystems.getReproduction());
        assertEquals(mockedDigestion, batSystems.getDigestion());
    }


}