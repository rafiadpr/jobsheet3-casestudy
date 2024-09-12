import java.util.Scanner;

public class TagihanListrik23 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String namaPelanggan;
        double tarif = 1500.0;
        int penggunaan_listrik;

        System.out.println("========================================");
        System.out.println("Aplikasi Tagihan Listrik");
        System.out.println("Selamat Datang");
        System.out.println("========================================");

        System.out.println("");
        System.out.print("Masukkan nama : ");
        namaPelanggan = input.nextLine();

        System.out.print("Masukkan penggunaan listrik : ");
        penggunaan_listrik = input.nextInt();

        double totalHarga = penggunaan_listrik * tarif;

        System.out.println("");
        System.out.println("========================================");
        System.out.println("Nama pelanggan : " + namaPelanggan);
        System.out.println("Total Tagihan : " + totalHarga);
        
        if (penggunaan_listrik > 500) {
            System.out.println("Penggunaan listrik anda melebihi 500 kWh");
        }
        else {
            System.out.println("Penggunaan listrik anda tidak melebihi 500 kWh");
        }
    }
}
