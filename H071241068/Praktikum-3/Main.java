public class Main {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer("Leah", 80, "Kebun Kecil", "Tomato", 3, "Watering Can", 10, 15);
        Farmer farmer3 = new Farmer("Alex", 10, "Kebun Alex", "Parnship", 3, "Watering Can", 10, 15);

        System.out.println("=== Aktivitas Farmer 1 ===");
        farmer1.displayInfo();

        farmer1.waterPlant();
        farmer1.waterPlant();
        farmer1.harvestPlant();

        farmer1.plantCrop("Parsnip", 3);
        farmer1.waterPlant();
        farmer1.waterPlant();
        farmer1.waterPlant();
        farmer1.harvestPlant();

        farmer1.rest();
        farmer1.displayInfo();

        System.out.println("=== Aktivitas Farmer 2 ===");
        farmer2.displayInfo();

        farmer2.waterPlant();
        farmer2.harvestPlant();
        farmer2.waterPlant();
        farmer2.harvestPlant();

        farmer2.displayInfo();

        System.out.println("=== Aktivitas Farmer 3 ===");
        farmer3.displayInfo();

        farmer3.waterPlant(); 
        farmer3.plantCrop("Wheat", 3); 
        farmer3.rest();
        farmer3.waterPlant(); 

        farmer3.displayInfo();
    }
}