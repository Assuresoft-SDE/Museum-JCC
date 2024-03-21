package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

import java.util.List;

public class CondorTest extends TestCase {
    private AnimalSystems condorSystems;
    private AnimalData condorData;

    @Before
    public void setUp() {
        condorSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(),
                List.of(Sensors.Vision, Sensors.Smell, Sensors.Touch),
                new CarnivorousDigestion());
        condorData = new AnimalData("ScientificName", "CommonName", "Cathartidae", "Gender");
    }

    @Test
    public void testCondorConstructorWithParameters() {
        Condor condor = new Condor(condorSystems, condorData);

        assertEquals(condorData, condor.getAnimalData());
        assertEquals(condorSystems, condor.getAnimalSystems());
    }

    @Test
    public void testCondorConstructorWithArguments() {
        String scientificName = "CondorScientificName";
        String commonName = "CondorCommonName";
        String gender = "Male";
        Condor condor = new Condor(scientificName, commonName, gender);

        AnimalData condorData = condor.getAnimalData();

        assertEquals(scientificName, condorData.getScientificName());
        assertEquals(commonName, condorData.getCommonName());
        assertEquals(gender, condorData.getGender());
    }

    @Test
    public void testCondorConstructorWithCorrectSystems() {
        String scientificName = "CondorScientificName";
        String commonName = "CondorCommonName";
        String gender = "Male";
        Condor condor = new Condor(scientificName, commonName, gender);

        AnimalSystems condorSystems = condor.getAnimalSystems();

        assertTrue(condorSystems.getDigestion() instanceof CarnivorousDigestion);
        assertTrue(condorSystems.getReproduction() instanceof SexualReproduction);
        assertTrue(condorSystems.getRespiration() instanceof LungRespiration);
        assertEquals(3, condorSystems.getSensors().size());
    }
}
