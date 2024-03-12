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
        Animal cougar = new Cougar("Pumar concolor incarum", "Andean Cougar","Male");

        cougar.sleep();
        cougar.translation();
        cougar.eat();
        cougar.breathe();
        cougar.reproduce();
        cougar.checkEnvironment();
    }
}
