package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatfishTest {
    private LungRespiration respiration;
    private SexualReproduction reproduction;
    private CarnivorousDigestion digestion;
    private AnimalData animalData;

    @Before
    public void setUp() throws  Exception {
        respiration = mock(LungRespiration.class);
        reproduction = mock(SexualReproduction.class);
        digestion = mock(CarnivorousDigestion.class);
        animalData = mock(AnimalData.class);
    }

    @Test
    public void testConstructorWithAnimalSystemsAndAnimalData() {

        when(respiration.toString()).thenReturn("LungRespiration");
        when(reproduction.toString()).thenReturn("SexualReproduction");
        when(digestion.toString()).thenReturn("CarnivorousDigestion");

    }

}