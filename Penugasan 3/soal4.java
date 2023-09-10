import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengambil jumlah penjualan dari pengguna
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlahPenjualan = input.nextInt();

        // Menghitung total pendapatan
        int gajiPokok = 500000;
        int hargaPerItem = 50000;
        int bonusPenjualan = 0;
        int denda = 0;

        if (jumlahPenjualan >= 40 && jumlahPenjualan <= 80) {
            bonusPenjualan = (int) (0.25 * jumlahPenjualan * hargaPerItem);
        } else if (jumlahPenjualan > 80) {
            bonusPenjualan = (int) (0.35 * jumlahPenjualan * hargaPerItem);
        } else if (jumlahPenjualan < 15) {
            denda = (int) (0.15 * (15 - jumlahPenjualan) * hargaPerItem);
        }

        int totalPendapatan = gajiPokok + bonusPenjualan - denda;

        System.out.println("Gaji yang diterima: " + totalPendapatan);
    }
}
