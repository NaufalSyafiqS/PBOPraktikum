import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas ini untuk merepresentasikan produk makanan
class Produk {
    private String namaProduk;
    private double harga;
    private int qty;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.qty = 0;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

// Kelas ini untuk merepresentasikan penjualan
class Penjualan {
    private Produk produk;
    private int quantity;

    public Penjualan(Produk produk, int quantity) {
        this.produk = produk;
        this.quantity = quantity;
    }

    public Produk getProduk() {
        return produk;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalHarga() {
        return produk.getHarga() * quantity;
    }
}

public class PemesananMakanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat daftar menu makanan
        List<Produk> menu = new ArrayList<>();
        menu.add(new Produk("Nasi Goreng", 15000.0));
        menu.add(new Produk("Mie Ayam", 12000.0));
        menu.add(new Produk("Bakso", 10000.0));
        menu.add(new Produk("Sate Ayam", 18000.0));
        menu.add(new Produk("Ayam Goreng", 16000.0));
        menu.add(new Produk("Nasi Padang", 20000.0));
        menu.add(new Produk("Mie Goreng", 13000.0));
        menu.add(new Produk("Soto Ayam", 14000.0));
        menu.add(new Produk("Rendang", 22000.0));
        menu.add(new Produk("Gado-gado", 17000.0));

        List<Penjualan> pesanan = new ArrayList<>();

        boolean lanjutPesan = true;
        while (lanjutPesan) {
            // Menampilkan menu
            System.out.println("Menu Makanan:");
            for (int i = 0; i < menu.size(); i++) {
                Produk produk = menu.get(i);
                System.out.println((i + 1) + ". " + produk.getNamaProduk() + " - Rp " + produk.getHarga());
            }

            // Meminta input dari pengguna
            System.out.print("Pilih nomor menu yang ingin dipesan: ");
            int nomorMenu = scanner.nextInt();
            if (nomorMenu < 1 || nomorMenu > menu.size()) {
                System.out.println("Nomor menu tidak valid.");
                continue;
            }

            Produk produkDipesan = menu.get(nomorMenu - 1);

            System.out.print("Masukkan jumlah yang ingin dipesan: ");
            int jumlahPesan = scanner.nextInt();
            if (jumlahPesan <= 0) {
                System.out.println("Jumlah pesanan tidak valid.");
                continue;
            }

            produkDipesan.setQty(produkDipesan.getQty() + jumlahPesan);

            pesanan.add(new Penjualan(produkDipesan, jumlahPesan));

            System.out.print("Ingin memesan item makanan lain? (y/n): ");
            String jawaban = scanner.next();
            if (!jawaban.equalsIgnoreCase("y")) {
                lanjutPesan = false;
            }
        }

        // untuk Menampilkan pesanan
        System.out.println("Pesanan Anda:");
        double totalBayar = 0.0;
        for (Penjualan pesananItem : pesanan) {
            System.out.println(pesananItem.getProduk().getNamaProduk() +
                    " - " + pesananItem.getQuantity() + " pcs - Rp " + pesananItem.getTotalHarga());
            totalBayar += pesananItem.getTotalHarga();
        }

        System.out.println("Total Bayar: Rp " + totalBayar);

        scanner.close();
    }
}
