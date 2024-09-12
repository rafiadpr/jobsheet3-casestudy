import java.util.Scanner;

public class Kafe23 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        System.out.println("========================================");
        System.out.println("Aplikasi Kafe");
        System.out.println("Selamat Datang");
        System.out.println("========================================");

        System.out.println("");

        System.out.print("Masukkan keanggotaan (true/false)\t : ");
        keanggotaan = input.nextBoolean();

        System.out.print("Masukkan Masukkan jumlah pembelian kopi\t : ");
        jmlKopi = input.nextInt();

        System.out.print("Masukkan Masukkan jumlah pembelian teh\t : ");
        jmlTeh = input.nextInt();

        System.out.print("Masukkan Masukkan jumlah pembelian roti\t : ");
        jmlRoti = input.nextInt();

        double totalHarga = (jmlKopi + hargaKopi) + (jmlTeh + hargaTeh) + (jmlRoti + hargaRoti);
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("");
        System.out.println("========================================");
        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item Pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        System.out.println("========================================");

    }
}
