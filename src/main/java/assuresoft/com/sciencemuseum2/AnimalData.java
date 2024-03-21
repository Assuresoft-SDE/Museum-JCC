package assuresoft.com.sciencemuseum2;

public class AnimalData {
    private String scientificName;
    private String commonName;
    private String family;
    private String gender;
    private static final String LINE_BREAK = "\n";
    public static final String ANIMAL_INFORMATION = "Animal Information";
    public static final String SCIENTIFIC_NAME_FIELD = "Scientific Name: ";
    public static final String COMMON_NAME_FIELD = "Common Name: ";
    public static final String FAMILY_FIELD = "Family: ";
    public static final String GENDER_FIELD = "Gender: ";


    public AnimalData(String scientificName, String commonName, String family, String gender) {
        this.scientificName = scientificName;
        this.commonName = commonName;
        this.family = family;
        this.gender = gender;
    }


    public String getAnimalData() {
        return ANIMAL_INFORMATION + LINE_BREAK +
                SCIENTIFIC_NAME_FIELD + getScientificName() + LINE_BREAK +
                COMMON_NAME_FIELD + getCommonName() + LINE_BREAK +
                FAMILY_FIELD + getFamily() + LINE_BREAK +
                GENDER_FIELD + getGender() + LINE_BREAK;
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
