package assuresoft.com.sciencemuseum2;

import assuresoft.com.sciencemuseum2.animals.Wolf;
import java.util.ArrayList;
import java.util.List;

public class WolfPack{
    private List<Wolf> wolfPackMembers;
    private static final String ALPHA_CHECK = "Checking if wolf is Alpha...\n";
    private static final String ALPHAS_FIGHT = """
            The wolf is alpha! He will fight with the Wolf Pack's Alpha now.
            The wolf lost, now he will not be considered alpha anymore.
            """;
    private static final String NOT_ALPHAS_FIGHT = "The wolf is not alpha, he will have no problem joining the Wolf Pack.\n";
    private static final String WOLF_JOINED_PACK = "The wolf has joined the Wolf Pack.\n\n";
    public WolfPack(Wolf maleWolf, Wolf femaleWolf){
        wolfPackMembers = new ArrayList<>(List.of(maleWolf,femaleWolf));
    }


    public String addWolfToPack(Wolf newWolf){
        String behaviour = ALPHA_CHECK;

        if (newWolf.isAlpha()) {
            behaviour = behaviour + ALPHAS_FIGHT;
            newWolf.setWolfRole(WolfRole.BETA);
        }
        else {
            behaviour = behaviour + NOT_ALPHAS_FIGHT;
        }

        behaviour = behaviour + WOLF_JOINED_PACK;
        wolfPackMembers.add(newWolf);
        newWolf.joinWolfPack(this);
        return behaviour;
    }

    public void searchNewArea(){
        int searchNotFoundIndex = -1;
        System.out.println("Looking for the wolf explorer \n");
        int indexWolfExplorer = FibonacciSearch.fibonacciSearch( wolfPackMembers, new Wolf("","","","",WolfRole.EXPLORER));
        if( indexWolfExplorer == searchNotFoundIndex ){
            System.out.println("explorer wolf not found");
        }
        else {
            Wolf wolfExplorer = wolfPackMembers.get(indexWolfExplorer);
            wolfExplorer.getAnimalInformation();
            System.out.println("The explorer wolf  will search for a new area \n");
        }
    }
}
