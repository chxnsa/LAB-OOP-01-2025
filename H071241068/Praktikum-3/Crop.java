public class Crop {
    private String nama;
    private int waktuPanen;
    private boolean sudahPanen;

    public Crop(String nama, int waktuPanen) {
        this.nama = nama;
        this.waktuPanen = waktuPanen;
        this.sudahPanen = false;
    }

    public void tumbuh() {
        if (waktuPanen > 0) {
            waktuPanen--;
        }
    }

    public void panen() {
        if (waktuPanen == 0 && !sudahPanen) {
            sudahPanen = true;
            System.out.println("Tanaman " + nama + " berhasil dipanen!");
        } else if (sudahPanen) {
            System.out.println("Tanaman " + nama + " sudah dipanen sebelumnya.");
        } else {
            System.out.println("Tanaman " + nama + " belum siap dipanen.");
        }
    }

    public boolean isSudahPanen() {
        return sudahPanen;
    }

    public String getNama() {
        return nama;
    }

    public int getWaktuPanen() {
        return waktuPanen;
    }

    public void displayInfo() {
        System.out.println("Status Tanaman: " + nama + " || Waktu sisa panen: " + waktuPanen + " || Sudah dipanen: " + (sudahPanen ? "Sudah" : "Belum"));
    }
}