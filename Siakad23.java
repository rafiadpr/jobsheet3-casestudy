
import java.util.Scanner;

public class Siakad23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nilaiAkhir;

        System.out.println("========================================");
        System.out.println("Aplikasi SIAKAD");
        System.out.println("Selamat Datang");
        System.out.println("========================================");

        System.out.println("");

        System.out.print("Masukkan nama\t : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM\t : ");
        String nim = sc.nextLine();

        System.out.print("Masukkan kelas\t : ");
        String kelas = sc.nextLine();

        System.out.print("Masukkan nomor absen\t : ");
        byte absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis\t : ");
        double nilaiKuis = sc.nextDouble();

        System.out.print("Masukkan nilai tugas\t : ");
        double nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan nilai UTS\t : ");
        double nilaiUTS = sc.nextDouble();
        
        System.out.print("Masukkan nilai UAS\t : ");
        double nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35);

        System.out.println("");
        System.out.println("Nama : " + nama + " NIM : " + nim);
        System.out.println("Kelas : " + kelas + " absen : " + absen);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
