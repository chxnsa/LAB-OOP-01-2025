public class Tool {
    private String nama;
    private int wateringCost;
    private int plantingCost;

    public Tool(String nama, int wateringCost, int plantingCost) {
        this.nama = nama;
        this.wateringCost = wateringCost;
        this.plantingCost = plantingCost;
    }

    public String getNama() {
        return nama;
    }

    public int getWateringCost() {
        return wateringCost;
    }

    public int getPlantingCost() {
        return plantingCost;
    }
}