package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.Wolf;

public class ExecuteWolfPack {
    private static final String SCIENTIFIC_NAME = "Canis lupus";
    private static final String FUR_COLOR = "White";
    private static final String MALE_GENDER = "Male";
    private static final String FEMALE_GENDER = "Female";
    public static void main(String[] args) {
        StringBuilder wolfPackBehavior = new StringBuilder();

        Wolf maleWolf = new Wolf(SCIENTIFIC_NAME,"Wolf1", MALE_GENDER,
                FUR_COLOR, WolfRole.ALPHA);

        Wolf femaleWolf = new Wolf(SCIENTIFIC_NAME,"Wolf2", FEMALE_GENDER,
                FUR_COLOR, WolfRole.ALPHA);

        Wolf wolf1 = new Wolf(SCIENTIFIC_NAME,"Wolf3", MALE_GENDER,
                FUR_COLOR, WolfRole.EXPLORER);

        Wolf wolf2 = new Wolf(SCIENTIFIC_NAME,"Wolf4", MALE_GENDER,
                FUR_COLOR, WolfRole.GAMMA);

        Wolf wolf3 = new Wolf(SCIENTIFIC_NAME,"Wolf5", MALE_GENDER,
                FUR_COLOR, WolfRole.HUNT_LEADER);

        WolfPack wolfpack = new WolfPack(maleWolf, femaleWolf);
        wolfPackBehavior.append(wolfpack.addWolfToPack(wolf1));
        wolfPackBehavior.append(wolfpack.addWolfToPack(wolf2));
        wolfPackBehavior.append(wolfpack.addWolfToPack(wolf3));

        System.out.println(wolfPackBehavior.toString());
    }
}
