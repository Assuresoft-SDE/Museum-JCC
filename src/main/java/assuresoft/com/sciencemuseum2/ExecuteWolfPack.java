package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.Wolf;

public class ExecuteWolfPack {
    private static final String SCIENTIFIC_NAME = "Canis lupus";
    private static final String FUR_COLOR = "White";
    public static void main(String[] args) {
        Wolf maleWolf = new Wolf(SCIENTIFIC_NAME,"Wolf1", "Male",
                FUR_COLOR, WolfRole.ALPHA);

        Wolf femaleWolf = new Wolf(SCIENTIFIC_NAME,"Wolf2", "Female",
                FUR_COLOR, WolfRole.ALPHA);

        Wolf wolf1 = new Wolf(SCIENTIFIC_NAME,"Wolf3", "Male",
                FUR_COLOR, WolfRole.EXPLORER);

        Wolf wolf2 = new Wolf(SCIENTIFIC_NAME,"Wolf4", "Male",
                FUR_COLOR, WolfRole.GAMMA);

        Wolf wolf3 = new Wolf(SCIENTIFIC_NAME,"Wolf5", "Male",
                FUR_COLOR, WolfRole.HUNT_LEADER);

        WolfPack wolfpack = new WolfPack(maleWolf, femaleWolf);
        wolfpack.addWolfToPack(wolf1);
        wolfpack.addWolfToPack(wolf2);
        wolfpack.addWolfToPack(wolf3);
        wolfpack.searchNewArea();
    }
}
