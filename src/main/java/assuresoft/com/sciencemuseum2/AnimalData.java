package assuresoft.com.sciencemuseum2;

public class AnimalData {
    private String scientificName;
    private String commonName;
    private String family;
    private String gender;
    private static final String LINE_BREAK = "\n";
    /**
     * @param scientificName    (String) The scientific name of the animal.
     * @param commonName        (String) The common name of the animal.
     * @param family            (String) The family to which the animal belongs.
     * @param gender            (String) The gender of the animal.
     */
    public AnimalData(String scientificName, String commonName, String family, String gender) {
        this.scientificName = scientificName;
        this.commonName = commonName;
        this.family = family;
        this.gender = gender;
    }


    public String getAnimalData() {
        return "Animal Information" + LINE_BREAK +
                "Scientific Name: " + getScientificName() + LINE_BREAK +
                "Common Name: " + getCommonName() + LINE_BREAK +
                "Family: " + getFamily() + LINE_BREAK +
                "Gender: " + getGender() + LINE_BREAK;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
