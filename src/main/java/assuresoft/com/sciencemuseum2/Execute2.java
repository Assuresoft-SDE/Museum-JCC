package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.Wolf;
import java.security.KeyStore;

public class Execute2 {
    public static void main(String[] args) {
        Wolf maleWolf = new Wolf("Canis lupus","Wolf1", "Male",
                "White", true);
        maleWolf.getAnimalInformation();
        maleWolf.performLifeProcesses();

        Wolf femaleWolf = new Wolf("Canis lupus","Wolf2", "Male",
                "White", false);
        femaleWolf.getAnimalInformation();
        femaleWolf.performLifeProcesses();

        Wolf wolf1 = new Wolf("Canis lupus","Wolf3", "Male",
                "White", false);
        wolf1.getAnimalInformation();
        wolf1.performLifeProcesses();

        Wolf wolf2 = new Wolf("Canis lupus","Wolf4", "Male",
                "White", true);
        wolf2.getAnimalInformation();
        wolf2.performLifeProcesses();

        Wolf wolf3 = new Wolf("Canis lupus","Wolf5", "Male",
                "White", false);
        wolf3.getAnimalInformation();
        wolf3.performLifeProcesses();

        WolfPack wolfpack = new WolfPack(maleWolf, femaleWolf);
        wolfpack.addWolfToPack(wolf1);
        wolfpack.addWolfToPack(wolf2);
        wolfpack.addWolfToPack(wolf3);
    }
}
