package assuresoft.com.sciencemuseum2.systems.sensorial;

import assuresoft.com.sciencemuseum2.interfaces.SensorialSystem;

public enum Sensors implements SensorialSystem {
    VISION,
    SMELL,
    TASTE,
    TOUCH,
    HEARING,
    ECHOLOCATION,
    CELL;


    private static final String SENSOR_FIELD = "Sensor: ";
    @Override
    public String recognize() {
        return formatMessage(SENSOR_FIELD + this.name());
    }
}
