import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tanggal dalam format dd-mm-yy: ");
        String date = input.nextLine();
        input.close(); 

        String[] listBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

    
        int tanggal = Integer.parseInt(date.substring(0, 2)); 
        int bulan = Integer.parseInt(date.substring(3, 5));   
        int tahun = Integer.parseInt(date.substring(6, 8));   

        tahun += (tahun >= 26) ? 1900 : 2000;

        String namaBulan = listBulan[bulan - 1];

        System.out.println(tanggal + " " + namaBulan + " " + tahun);
    }
}
