import java.util.logging.Level;
import java.util.logging.Logger;
public class Restaurant {

    //tidak memenuhi poin no 1 - Always keep data private.
    //tidak memenuhi poin no 2 - Always initialize data.
    //access modifiernya masih public, harusnya private, tidak menerapkan enkapsulasi
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private static byte id=0;

    private static final Logger logger = Logger.getLogger(Restaurant.class.getName());


    //tidak menggunakan this, sebagai pembeda objek
    public Restaurant () {
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan (String nama, double harga, int stok) {
        this.namaMakanan [id] = nama;
        this.hargaMakanan [id] = harga;
        this.stok [id] = stok;
    }
    public void tampilMenuMakanan () {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                logger.log(Level.INFO, "{0} [{1}] \tRp. {2}", new Object[]{namaMakanan[i], stok[i], hargaMakanan[i]});
            }
        }
    }

    public boolean isOutOfStock (int id) {
        return (stok [id] == 0);
    }
    public static void nextId() {
        id++;
    }
}