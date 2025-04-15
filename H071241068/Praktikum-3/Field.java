public class Field {
    private String nama;
    private Crop crop;
    private String statusLahan;

    public Field(String nama, Crop crop) {
        this.nama = nama;
        this.crop = crop;
        this.statusLahan = "Kering";
    }

    public void siram() {
        statusLahan = "Lembab";
        if (crop != null && !crop.isSudahPanen()) {
            crop.tumbuh();
        }
    }

    public void tanam(Crop newCrop) {
        this.crop = newCrop;
        this.statusLahan = "Kering";
        System.out.println("Tanaman " + newCrop.getNama() + " berhasil ditanam di " + nama);
    }

    public Crop getCrop() {
        return crop;
    }

    public void displayInfo() {
        System.out.println("Lahan: " + nama + " || Status Lahan: " + statusLahan);
        if (crop != null) {
            crop.displayInfo();
        } else {
            System.out.println("Belum ada tanaman di lahan ini.");
        }
    }
}