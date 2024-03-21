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
    private static final String SEARCH_FOR_EXPLORER_WOLF = "The wolf has joined the Wolf Pack.\n\n";
    private static final String NOT_FOUND_EXPLORER_WOLF = "explorer wolf not found";
    private static final String WOLF_EXPLORING = "The explorer wolf  will search for a new area \n";
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

    public String searchNewArea(){
        StringBuilder searchBehavior = new StringBuilder();

        int searchNotFoundIndex = -1;
        searchBehavior.append(SEARCH_FOR_EXPLORER_WOLF);
        int indexWolfExplorer = FibonacciSearch.fibonacciSearch( wolfPackMembers, new Wolf("","","","",WolfRole.EXPLORER));

        if( indexWolfExplorer == searchNotFoundIndex ){
            searchBehavior.append(NOT_FOUND_EXPLORER_WOLF);
        }
        else {
            Wolf wolfExplorer = wolfPackMembers.get(indexWolfExplorer);
            wolfExplorer.getAnimalInformation();
            searchBehavior.append(WOLF_EXPLORING);
        }

        return searchBehavior.toString();
    }
}
