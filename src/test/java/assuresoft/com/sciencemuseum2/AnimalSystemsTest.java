package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;
import assuresoft.com.sciencemuseum2.interfaces.ReproductiveSystem;
import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.digestive.HerbivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.digestive.OmnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.AsexualReproduction;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.GillsRespiration;
import assuresoft.com.sciencemuseum2.systems.respiratory.IntegumentaryRespiration;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.respiratory.TrachealRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.mockito.Mockito.mock;

public class AnimalSystemsTest {
    private CarnivorousDigestion mockedCarnivorousDigestion;
    private LungRespiration mockedLungRespiration;
    private SexualReproduction mockedSexualReproduction;
    private List<Sensors> mockedSensors;

    @Before
    public void init(){
        mockedCarnivorousDigestion = mock(CarnivorousDigestion.class);
        mockedLungRespiration = mock(LungRespiration.class);
        mockedSexualReproduction = mock(SexualReproduction.class);
        mockedSensors = mock(List.class);
    }

    @Test
    public void testCarnivorousEatingProcess() {
        String eatingProcess = getEatingProcess(new CarnivorousDigestion());

        String expectedEatingProcessOutput = """
                \t- Consuming meat or animal products.
                \t- Chewing or breaking down meat using teeth.
                \t- Digesting meat using stomach acids and enzymes.
                \t- Absorbing nutrients from digested meat in the small intestine.
                \t- Eliminating undigested waste as feces.
                """;

        Assert.assertEquals(eatingProcess, expectedEatingProcessOutput);
    }

    @Test
    public void testHerbivorousEatingProcess() {
        String eatingProcess = getEatingProcess(new HerbivorousDigestion());

        String expectedEatingProcessOutput = """
                \t- Consuming plant material.
                \t- Grinding plant material using molars or other specialized teeth.
                \t- Breaking down plant material with enzymes in the stomach and intestines.
                \t- Absorbing nutrients from digested plant material in the small intestine.
                \t- Excreting undigested plant matter as feces.
                """;

        Assert.assertEquals(eatingProcess, expectedEatingProcessOutput);
    }

    @Test
    public void testOmnivorousEatingProcess() {
        String eatingProcess = getEatingProcess(new OmnivorousDigestion());

        String expectedEatingProcessOutput = """
                \t- Consuming a variety of plant and animal-based foods.
                \t- Chewing and breaking down food using teeth.
                \t- Digesting food using a combination of stomach acids and enzymes.
                \t- Absorbing nutrients from digested food in the small intestine.
                \t- Eliminating undigested waste as feces.
                """;

        Assert.assertEquals(eatingProcess, expectedEatingProcessOutput);
    }

    @Test
    public void testGillsBreathingProcess() {
        String breathingProcess = getBreathingProcess(new GillsRespiration());

        String expectedBreathingProcessOutput = """
                \t- Absorbing oxygen from water through gills.
                \t- Transporting oxygen through the bloodstream via gills.
                \t- Exchanging gases between water and blood in gill capillaries.
                \t- Releasing carbon dioxide into the water through gills.
                """;

        Assert.assertEquals(breathingProcess, expectedBreathingProcessOutput);
    }

    @Test
    public void testIntegumentaryBreathingProcess() {
        String breathingProcess = getBreathingProcess(new IntegumentaryRespiration());

        String expectedBreathingProcessOutput = """
                \t- Extracting oxygen through the skin.
                \t- Transporting oxygen through the skin to cells.
                \t- Exchanging gases through the skin surface.
                \t- Eliminating carbon dioxide through the skin.
                """;

        Assert.assertEquals(breathingProcess, expectedBreathingProcessOutput);
    }

    @Test
    public void testLungBreathingProcess() {
        String breathingProcess = getBreathingProcess(new LungRespiration());

        String expectedBreathingProcessOutput = """
                \t- Inhaling oxygen from the environment.
                \t- Transporting oxygen through the bloodstream via lungs.
                \t- Exchanging gases between alveoli and blood capillaries.
                \t- Eliminating carbon dioxide by exhaling.
                """;

        Assert.assertEquals(breathingProcess, expectedBreathingProcessOutput);
    }

    @Test
    public void testTrachealBreathingProcess() {
        String breathingProcess = getBreathingProcess(new TrachealRespiration());

        String expectedBreathingProcessOutput = """
                \t- Absorbing oxygen directly through tracheal tubes.
                \t- Transporting oxygen through tracheal system to cells.
                \t- Exchanging gases between tracheoles and body cells.
                \t- Releasing carbon dioxide through tracheal system.
                """;

        Assert.assertEquals(breathingProcess, expectedBreathingProcessOutput);
    }

    @Test
    public void testCheckEnvironment() {
        AnimalSystems animalSystems = new AnimalSystems(mockedLungRespiration,
                                                        mockedSexualReproduction,
                                                        getAllAnimalSensors(),
                                                        mockedCarnivorousDigestion);

        String checkEnvironmentProcess = animalSystems.checkEnvironment();

        String expectedEnvironmentCheckOutput = """
                \t- Sensor: Taste
                \t- Sensor: Vision
                \t- Sensor: Smell
                \t- Sensor: Touch
                \t- Sensor: Hearing
                \t- Sensor: Echolocation
                \t- Sensor: Cell
                """;

        Assert.assertEquals(checkEnvironmentProcess, expectedEnvironmentCheckOutput);
    }

    @Test
    public void testSexualReproductionProcess() {
        String sexualProcess = getSexualProcess(new SexualReproduction());

        String expectedReproductionProcessOutput = """
                \t- The process of individuals coming together to exchange genetic material.
                \t- The fusion of gametes (sperm and egg) to form a zygote, which develops into a new organism.
                """;

        Assert.assertEquals(sexualProcess, expectedReproductionProcessOutput);
    }

    @Test
    public void testAsexualReproductionProcess() {
        String sexualProcess = getSexualProcess(new AsexualReproduction());

        String expectedReproductionProcessOutput = """
                \t- Reproduction through the division of a single cell into two identical daughter cells.
                \t- Reproduction through the formation of a small bud or outgrowth, which detaches to become a new organism.
                """;

        Assert.assertEquals(sexualProcess, expectedReproductionProcessOutput);
    }

    private List<Sensors> getAllAnimalSensors() {
        return List.of(Sensors.Taste,
                Sensors.Vision,
                Sensors.Smell,
                Sensors.Touch,
                Sensors.Hearing,
                Sensors.Echolocation,
                Sensors.Cell);
    }

    private String getEatingProcess(DigestiveSystem digestiveSystem){
        AnimalSystems animalSystems = new AnimalSystems(mockedLungRespiration,
                mockedSexualReproduction,
                mockedSensors,
                digestiveSystem);

        return animalSystems.executeEatingProcess();
    }

    private String getBreathingProcess(RespiratorySystem respiratorySystem){
        AnimalSystems animalSystems = new AnimalSystems(respiratorySystem,
                mockedSexualReproduction,
                mockedSensors,
                mockedCarnivorousDigestion);

        return animalSystems.executeBreathingProcess();
    }

    private String getSexualProcess(ReproductiveSystem reproductiveSystem){
        AnimalSystems animalSystems = new AnimalSystems(mockedLungRespiration,
                reproductiveSystem,
                mockedSensors,
                mockedCarnivorousDigestion);

        return animalSystems.executeReproductionProcess();
    }
}
