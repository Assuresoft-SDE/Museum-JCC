package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.interfaces.DigestiveSystem;
import assuresoft.com.sciencemuseum2.interfaces.ReproductiveSystem;
import assuresoft.com.sciencemuseum2.interfaces.RespiratorySystem;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;

import java.util.List;

public class AnimalSystems {
    private final RespiratorySystem respiratorySystem;
    private final ReproductiveSystem reproductiveSystem;
    private final List<Sensors> sensorsList;
    private final DigestiveSystem digestiveSystem;

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


    public void executeEatingProcess() {
        digestiveSystem.intake();
        digestiveSystem.mechanicalDigestion();
        digestiveSystem.chemicalDigestion();
        digestiveSystem.nutrientAbsorption();
        digestiveSystem.fecalMatterElimination();
    }

    public void executeBreathingProcess() {
        respiratorySystem.getOxygen();
        respiratorySystem.transportOxygen();
        respiratorySystem.gasExchange();
        respiratorySystem.co2Elimination();
    }

    public void checkEnvironment(){
        sensorsList.forEach(Sensors::recognize);
    }

    public void executeReproductionProcess() {
        reproductiveSystem.reproduce();
    }
}
