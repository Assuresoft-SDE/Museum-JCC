package assuresoft.com.sciencemuseum2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalDataTest {
    private AnimalData animalData;
    private static final String SCIENTIFIC_NAME = "Canis lupus";
    private static final String COMMON_NAME = "Wolf";
    private static final String FAMILY = "Canidae";
    private static final String GENDER = "Male";
    @Before
    public void init(){
        animalData = new AnimalData(SCIENTIFIC_NAME,
                                    COMMON_NAME,
                                    FAMILY,
                                    GENDER);
    }

    @Test
    public void testGetAnimalData() {
        String currentAnimalData = animalData.getAnimalData();

        String expectedAnimalData = """
                Animal Information
                Scientific Name: Canis lupus
                Common Name: Wolf
                Family: Canidae
                Gender: Male
                """;

        Assert.assertEquals(currentAnimalData, expectedAnimalData);
    }

    @Test
    public void testGetScientificName() {
        String scientificName = animalData.getScientificName();
        String expectedScientificName = "Canis lupus";
        Assert.assertEquals(scientificName, expectedScientificName);
    }

    @Test
    public void testSetScientificName() {
        String expectedScientificName = "Edited Canis lupus";

        animalData.setScientificName(expectedScientificName);
        String scientificName = animalData.getScientificName();

        Assert.assertEquals(scientificName, expectedScientificName);
    }

    @Test
    public void testGetCommonName() {
        String commonName = animalData.getCommonName();
        String expectedCommonName = "Wolf";
        Assert.assertEquals(commonName, expectedCommonName);
    }

    @Test
    public void testSetCommonName() {
        String expectedCommonName = "Edited Wolf";

        animalData.setCommonName(expectedCommonName);
        String commonName = animalData.getCommonName();

        Assert.assertEquals(commonName, expectedCommonName);
    }

    @Test
    public void testGetFamily() {
        String animalFamily = animalData.getFamily();
        String expectedAnimalFamily = "Canidae";
        Assert.assertEquals(animalFamily, expectedAnimalFamily);
    }

    @Test
    public void testSetFamily() {
        String expectedAnimalFamily = "Edited Canidae";

        animalData.setFamily(expectedAnimalFamily);
        String animalFamily = animalData.getFamily();

        Assert.assertEquals(animalFamily, expectedAnimalFamily);
    }

    @Test
    public void testGetGender() {
        String animalGender = animalData.getGender();
        String expectedAnimalGender = "Male";
        Assert.assertEquals(animalGender, expectedAnimalGender);
    }

    @Test
    public void testSetGender() {
        String expectedAnimalGender = "Edited Male";

        animalData.setGender(expectedAnimalGender);
        String animalGender = animalData.getGender();

        Assert.assertEquals(animalGender, expectedAnimalGender);
    }
}
