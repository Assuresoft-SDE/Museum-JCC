package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.Cougar;
import assuresoft.com.sciencemuseum2.systems.digestive.CarnivorousDigestion;
import assuresoft.com.sciencemuseum2.systems.reproductive.SexualReproduction;
import assuresoft.com.sciencemuseum2.systems.respiratory.LungRespiration;
import assuresoft.com.sciencemuseum2.systems.sensorial.Sensors;

import java.util.ArrayList;
import java.util.List;

public class Execute {
    public static void main(String[] args) {
        /*
        AnimalData cougarData = new AnimalData("Puma concolor", "Cougar", "Mammal", "Male");
        Cougar cougar = new Cougar(cougarData);



         */
        List<Sensors> sensors = new ArrayList(List.of(Sensors.Echolocation, Sensors.Vision, Sensors.Smell));
        AnimalData cougarData = new AnimalData("Pumar concolor", "Cougar","Felidae", "Male");
        AnimalSystems cougarSystems = new AnimalSystems(new LungRespiration(), new SexualReproduction(),sensors, new CarnivorousDigestion());
        Animal cougar = new Cougar(cougarSystems, cougarData);
        sensors.forEach(Sensors::recognize);
        cougar.sleep();
        cougar.translation();
        cougar.eat();
        cougar.breathe();
        cougar.reproduce();
    }



}
