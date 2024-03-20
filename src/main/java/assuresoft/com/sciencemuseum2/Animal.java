package assuresoft.com.sciencemuseum2;

public abstract class Animal {
    private AnimalSystems animalSystems;
    private AnimalData animalData;
    private static final String LINE_BREAK = "\n";


    public Animal() {
    }


    public Animal(AnimalSystems animalSystems, AnimalData animalData) {
        this.animalSystems = animalSystems;
        this.animalData = animalData;
    }


    public void setAnimalSystems(AnimalSystems animalSystems) {
        this.animalSystems = animalSystems;
    }

    public void setAnimalData(AnimalData animalData) {
        this.animalData = animalData;
    }

    public String translation() {
        return this.animalData.getCommonName() + " is moving...";
    }

    public String sleep() {
        return this.animalData.getCommonName() + " is sleeping...";
    }

    public String eat() {
        return "Starting to eat:" + LINE_BREAK +
                this.animalSystems.executeEatingProcess() +
                "Finished digestion." + LINE_BREAK;
    }

    public String breathe() {
        return "Starting to breath:" + LINE_BREAK +
                this.animalSystems.executeBreathingProcess() +
                "Finished breathing." + LINE_BREAK;
    }

    public String reproduce() {
        return "Starting to reproduce:" + LINE_BREAK +
                this.animalSystems.executeReproductionProcess() +
                "Finished reproducing." + LINE_BREAK;
    }

    public String checkEnvironment() {
        return "Checking environment with the following sensors:" + LINE_BREAK +
                animalSystems.checkEnvironment() +
                "Finished checking environment." + LINE_BREAK;
    }

    public String getAnimalInformation() {
        return animalData.getAnimalData();
    }

    public String performLifeProcesses() {
        return translation() + LINE_BREAK +
                sleep() + LINE_BREAK +
                eat() + LINE_BREAK +
                breathe() + LINE_BREAK +
                reproduce() + LINE_BREAK +
                checkEnvironment() + LINE_BREAK;
    }
}
