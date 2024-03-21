package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.OmnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.GillsRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;

public class CatfishTest {
    private AnimalSystems CatFishSystems;
    private AnimalData CatFishData;

    @Before
    public void setUp() {
        CatFishSystems = new AnimalSystems(new GillsRespiration(), new SexualReproduction(),
                List.of(Sensors.Vision, Sensors.Smell, Sensors.Touch, Sensors.Taste),
                new OmnivorousDigestion());
        CatFishData = new AnimalData("ScientificName", "CommonName", "Siluridae", "Gender");
    }

    @Test
    public void testCatfishConstructorWithParameters() {
        Catfish catfish = new Catfish(CatFishSystems, CatFishData);

        assertEquals(CatFishData, catfish.getAnimalData());
        assertEquals(CatFishSystems, catfish.getAnimalSystems());
    }

    @Test
    public void testCatfishConstructorWithArguments() {
        String scientificName = "CatfishScientificName";
        String commonName = "CatfishCommonName";
        String gender = "Male";
        Catfish catfish = new Catfish(scientificName, commonName, gender);

        AnimalData catfishData = catfish.getAnimalData();

        assertEquals(scientificName, catfishData.getScientificName());
        assertEquals(commonName, catfishData.getCommonName());
        assertEquals(gender, catfishData.getGender());
    }

    @Test
    public void testCatfishConstructorWithCorrectSystems() {
        String scientificName = "CatfishScientificName";
        String commonName = "CatfishCommonName";
        String gender = "Male";
        Catfish catfish = new Catfish(scientificName, commonName, gender);

        AnimalSystems catfishSystems = catfish.getAnimalSystems();

        assertTrue(catfishSystems.getDigestion() instanceof OmnivorousDigestion);
        assertTrue(catfishSystems.getReproduction() instanceof SexualReproduction);
        assertTrue(catfishSystems.getRespiration() instanceof GillsRespiration);
        assertEquals(4, catfishSystems.getSensors().size());
    }
}
