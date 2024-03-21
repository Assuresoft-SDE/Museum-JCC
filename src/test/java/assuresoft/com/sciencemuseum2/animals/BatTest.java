package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
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
        String scientificName = "BatScientificName";
        String commonName = "BatCommonName";
        String gender = "Male";
        Bat bat = new Bat(scientificName, commonName, gender);

        AnimalSystems batSystems = bat.getAnimalSystems();

        assertTrue(batSystems.getDigestion() instanceof CarnivorousDigestion);
        assertTrue(batSystems.getReproduction() instanceof SexualReproduction);
        assertTrue(batSystems.getRespiration() instanceof LungRespiration);
        assertTrue(batSystems.getSensors() != null);
    }


}