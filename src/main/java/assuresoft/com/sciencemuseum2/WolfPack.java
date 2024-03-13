package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.Wolf;

import java.util.ArrayList;
import java.util.List;

public class WolfPack{
    private List<Wolf> wolfPackMembers;
    public WolfPack(Wolf maleWolf, Wolf femaleWolf){
        wolfPackMembers = new ArrayList<>(List.of(maleWolf,femaleWolf));
    }


    public void addWolfToPack(Wolf newWolf){
        System.out.println("Checking if wolf is Alpha...");
        if (newWolf.isAlpha()){
            System.out.println("The wolf is alpha! He will fight with the Wolf Pack's Alpha now.");
            System.out.println("The wolf lost, now he will not be considered alpha anymore.");
            newWolf.setAlpha(false);
        }else {
            System.out.println("The wolf is not alpha, he will have no problem joining the Wolf Pack.");
        }
        System.out.println("The wolf has joined the Wolf Pack.\n");
        wolfPackMembers.add(newWolf);
        newWolf.joinWolfPack(this);
    }
}