package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.Cougar;

public class Execute {
    public static void main(String[] args) {
        Animal cougar = new Cougar("Pumar concolor incarum", "Andean Cougar","Male");

        cougar.sleep();
        cougar.translation();
        cougar.eat();
        cougar.breathe();
        cougar.reproduce();
        cougar.checkEnvironment();

        // cougar.getInformation  (AnimalData)
        // cougar.getBehaviours()
    }
}
