package assuresoft.com.sciencemuseum2.systems.sensorial;

import assuresoft.com.sciencemuseum2.interfaces.SensorialSystem;

public enum Sensors implements SensorialSystem {
    Vision,
    Smell,
    Enthusiasm,
    Touch,
    Hearing,
    Echolocation;

    @Override
    public void recognize() {
        System.out.println("Sensor: " + this.name());
    }
}
