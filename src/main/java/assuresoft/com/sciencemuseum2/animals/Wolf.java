package assuresoft.com.sciencemuseum2.animals;

import assuresoft.com.sciencemuseum2.Animal;
import assuresoft.com.sciencemuseum2.AnimalData;
import assuresoft.com.sciencemuseum2.AnimalSystems;
import assuresoft.com.sciencemuseum2.WolfPack;
import assuresoft.com.sciencemuseum2.WolfRole;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;
import java.util.List;
import java.util.Objects;

public class Wolf extends Animal implements Comparable<Wolf> {
    private String coatColor;
    private WolfPack wolfPack;
    private WolfRole role;
    /**
     * @param animalSystems (AnimalSystems) The animal body systems associated with the wolf.
     * @param animalData    (AnimalData) The information associated with the wolf.
     */
    public Wolf(AnimalSystems animalSystems, AnimalData animalData) {
        super(animalSystems, animalData);
    }


    /**
     * @param scientificName (String) The scientific name of the wolf.
     * @param commonName     (String) The common name of the wolf.
     * @param gender         (String) The gender of the wolf.
     * @param coatColor      (String) The fur color of the wolf.
     * @param wolfRole        (WolfRole) Specifies the role of the wolf in the pack.
     */
    public Wolf(String scientificName, String commonName, String gender, String coatColor, WolfRole wolfRole) {
        AnimalData wolfData = new AnimalData(scientificName, commonName, "Canidae", gender);
        List<Sensors> wolfSensors = List.of(Sensors.Hearing, Sensors.Vision, Sensors.Smell, Sensors.Touch, Sensors.Taste);
        AnimalSystems wolfSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(), wolfSensors, new CarnivorousDigestion());
        this.coatColor = coatColor;
        this.role = wolfRole;
        super.setAnimalData(wolfData);
        super.setAnimalSystems(wolfSystems);
    }


    @Override
    public String getAnimalInformation() {
        return super.getAnimalInformation() +
                "Coat Color: " + coatColor +
                "Role: " + role;
    }

    public void joinWolfPack(WolfPack wolfPack) {
        this.wolfPack = wolfPack;
    }

    public boolean isAlpha() {
        return role==WolfRole.ALPHA;
    }

    public WolfRole getWolfRole() {
        return role;
    }

    public void setWolfRole(WolfRole wolfRole) {
        this.role = wolfRole;
    }

    /**
     * "compareTo" will compare strings in alphabetical order
     * The result is a negative integer if this string lexicographically precedes the argument string.
     * The result is a positive integer if this string lexicographically follows the argument string.
     * The result is zero if the strings are equal
     *
     * @param   anotherWolf  (Wolf Class)
     * @return               (int)
     */
    @Override
    public int compareTo(Wolf anotherWolf) {
        return this.role.compareTo(anotherWolf.getWolfRole());
    }
}
