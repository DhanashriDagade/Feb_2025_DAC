interface Photosynthesis {
    void absorbSunlight(); 
}

interface Respiration {
    void releaseOxygen(); 
}

class Plant implements Photosynthesis, Respiration {
    private String plantName; 
    public Plant(String name) {
        this.plantName = name;
    }

  
    public String getPlantName() {
        return plantName;
    }

    @Override
    public void absorbSunlight() {
        System.out.println(plantName + " is absorbing sunlight for photosynthesis.");
    }

    @Override
    public void releaseOxygen() {
        System.out.println(plantName + " is releasing oxygen through respiration.");
    }
}

public class PlantTest {
    public static void main(String[] args) {

        Plant mangoTree = new Plant("Mango Tree");
        Plant fern = new Plant("Fern");

        System.out.println("Plant Name: " + mangoTree.getPlantName());
        mangoTree.absorbSunlight();
        mangoTree.releaseOxygen();

        System.out.println(); 

        System.out.println("Plant Name: " + fern.getPlantName());
        fern.absorbSunlight();
        fern.releaseOxygen();
    }
}
/*Plant Name: Mango Tree
Mango Tree is absorbing sunlight for photosynthesis.
Mango Tree is releasing oxygen through respiration.

Plant Name: Fern
Fern is absorbing sunlight for photosynthesis.
Fern is releasing oxygen through respiration.*/
