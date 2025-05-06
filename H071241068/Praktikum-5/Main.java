import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hero karakter = null;

        System.out.println("Pilih karakter:");
        System.out.println("1. Pemanah");
        System.out.println("2. Penyihir");
        System.out.println("3. Petarung");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                karakter = new Pemanah();
                break;
            case 2:
                karakter = new Penyihir();
                break;
            case 3:
                karakter = new Petarung();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);

                input.close();
        }

        int menu;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilih aksi: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    karakter.serang();
                    break;
                case 2:
                    System.out.println("Game selesai!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (menu != 2);
    }
}
