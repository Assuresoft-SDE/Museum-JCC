package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;
import assuresoft.com.sciencemuseum2.interfaces.ReproductiveSystem;
import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;
import java.util.List;

public class AnimalSystems {
    private final RespiratorySystem respiratorySystem;
    private final ReproductiveSystem reproductiveSystem;
    private final List<Sensors> sensorsList;
    private final DigestiveSystem digestiveSystem;
    private static final String LINE_BREAK = "\n";

    public AnimalSystems(
        RespiratorySystem respiratorySystem,
        ReproductiveSystem reproductiveSystem,
        List<Sensors> sensorsList,
        DigestiveSystem digestiveSystem
    ) {
        this.respiratorySystem = respiratorySystem;
        this.reproductiveSystem = reproductiveSystem;
        this.sensorsList = sensorsList;
        this.digestiveSystem = digestiveSystem;
    }


    public String executeEatingProcess() {
        return digestiveSystem.intake() + LINE_BREAK +
                digestiveSystem.mechanicalDigestion() + LINE_BREAK +
                digestiveSystem.chemicalDigestion() + LINE_BREAK +
                digestiveSystem.nutrientAbsorption() + LINE_BREAK +
                digestiveSystem.fecalMatterElimination() + LINE_BREAK;
    }

    public String executeBreathingProcess() {
        return respiratorySystem.getOxygen() + LINE_BREAK +
                respiratorySystem.transportOxygen() + LINE_BREAK +
                respiratorySystem.gasExchange() + LINE_BREAK +
                respiratorySystem.co2Elimination() + LINE_BREAK;
    }

    public String checkEnvironment(){
        StringBuilder checkEnvironmentBehavior = new StringBuilder();
        sensorsList.forEach(sensor -> checkEnvironmentBehavior.append(sensor.recognize()).append("\n"));

        return checkEnvironmentBehavior.toString();
    }

    public String executeReproductionProcess() {
        return reproductiveSystem.reproduce();
    }

    public List<Sensors> getSensors() {
        return this.sensorsList;
    }

    public RespiratorySystem getRespiration() {
        return this.respiratorySystem;
    }

    public ReproductiveSystem getReproduction() {
        return this.reproductiveSystem;
    }

    public DigestiveSystem getDigestion() {
        return this.digestiveSystem;
    }
}
