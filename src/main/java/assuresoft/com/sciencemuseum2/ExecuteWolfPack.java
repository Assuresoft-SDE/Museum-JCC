package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.Wolf;

public class ExecuteWolfPack {
    public static void main(String[] args) {
        Wolf maleWolf = new Wolf("Canis lupus","Wolf1", "Male",
                "White", true);

        Wolf femaleWolf = new Wolf("Canis lupus","Wolf2", "Female",
                "White", false);

        Wolf wolf1 = new Wolf("Canis lupus","Wolf3", "Male",
                "White", false);

        Wolf wolf2 = new Wolf("Canis lupus","Wolf4", "Male",
                "White", true);

        Wolf wolf3 = new Wolf("Canis lupus","Wolf5", "Male",
                "White", false);

        WolfPack wolfpack = new WolfPack(maleWolf, femaleWolf);
        wolfpack.addWolfToPack(wolf1);
        wolfpack.addWolfToPack(wolf2);
        wolfpack.addWolfToPack(wolf3);
    }
}
