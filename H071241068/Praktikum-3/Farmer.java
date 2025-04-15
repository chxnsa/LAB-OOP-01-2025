public class Farmer {
    private String nama;
    private int stamina;
    private Field field;
    private Tool tool;

    public Farmer() {
        this("Petani Anonim", 100, "Lahan Baru", "Parsnip", 3, "Watering Can", 10, 15);
    }

    public Farmer(String nama, int stamina, String fieldNama, String cropNama, int hariPanen, String toolNama, int wateringCost, int plantingCost) {
        this.nama = nama;
        this.stamina = stamina;
        this.field = new Field(fieldNama, new Crop(cropNama, hariPanen));
        this.tool = new Tool(toolNama, wateringCost, plantingCost);
    }

    public void waterPlant() {
        if (stamina >= tool.getWateringCost()) {
            stamina -= tool.getWateringCost();
            field.siram();
            System.out.println("Farmer " + nama + " menyiram tanaman dengan " + tool.getNama() + ". Stamina tersisa: " + stamina);
        } else {
            System.out.println("Farmer " + nama + " terlalu lelah untuk menyiram.");
        }
    }

    public void plantCrop(String cropNama, int hariPanen) {
        if (stamina >= tool.getPlantingCost()) {
            Crop newCrop = new Crop(cropNama, hariPanen);
            field.tanam(newCrop);
            stamina -= tool.getPlantingCost();
            System.out.println("Farmer " + nama + " menanam " + cropNama + ". Stamina tersisa: " + stamina);
        } else {
            System.out.println("Farmer " + nama + " terlalu lelah untuk menanam tanaman.");
        }
    }

    public void harvestPlant() {
        if (field.getCrop() != null) {
            field.getCrop().panen();
        } else {
            System.out.println("Tidak ada tanaman yang bisa dipanen.");
        }
    }

    public void rest() {
        stamina = 100;
        System.out.println("Farmer " + nama + " beristirahat. Stamina pulih.");
    }

    public void displayInfo() {
        System.out.println("\n===== Status Petani =====");
        System.out.println("Nama: " + nama);
        System.out.println("Stamina: " + stamina);
        field.displayInfo();
        System.out.println("==========================\n");
    }
}
