package assuresoft.com.sciencemuseum2.systems.sensorial;

import assuresoft.com.sciencemuseum2.interfaces.SensorialSystem;

public enum Sensors implements SensorialSystem {
    Vision,
    Smell,
    Taste,
    Touch,
    Hearing,
    Echolocation,
    Cell;

    @Override
    public String recognize() {
        return formatMessage("Sensor: " + this.name());
    }
}
