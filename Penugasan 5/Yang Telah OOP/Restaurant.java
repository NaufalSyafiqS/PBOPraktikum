import java.util.ArrayList;
import java.util.List;

class Order{
    private final String namaMakanan;
    private double hargaMakanan;
    private final int quant;
    private double hargaFinal;

    public Order (String namaMakanan, double hargaMakanan, int quant) {
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.quant = quant;
        this.hargaFinal = quant * hargaMakanan;
    }

    public int getQuant() {
        return quant;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public double getTotalPrice(){
        return hargaFinal;
    }
}
public class Restaurant {
    public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stok;
    private static byte id=0;

    private List<Order> orders = new ArrayList<>();
    public Restaurant () {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan (String nama, double harga, int stok) {
        this.nama_makanan [id] = nama;
        this.harga_makanan [id] = harga;
        this.stok [id] = stok;
    }

    public void kurangStok(int jml, int id){
        this.stok [id] -= jml;
    }

    public void tampilMenuMakanan () {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(i+". " + nama_makanan [i] +"["+stok [i]+"]"+"\tRp. "+harga_makanan [i]);
            }
        }
    }

    public boolean isOutOfStock (int id) {
        return stok[id] == 0;
    }

    public boolean isQuantityMoreThanStock(int id, int quantity){
        return quantity>stok[id];
    }

    public void placeOrder(int menuIndex, int quantity) {
        if (menuIndex >= 0 && menuIndex <= id && !isOutOfStock(menuIndex) && !isQuantityMoreThanStock(menuIndex, quantity)) {
            Order order = new Order(nama_makanan[menuIndex], harga_makanan[menuIndex], quantity);
            orders.add(order);
            kurangStok(quantity,menuIndex);
        } else {
            System.out.println("Invalid menu selection or out of stock.");
        }
    }

    public void displayOrders() {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            System.out.println("Order " + (i + 1) + ": " + order.getNamaMakanan() + " x" + order.getQuant() + "\tTotal: Rp. " + order.getTotalPrice());
        }
    }
    public static void nextId() {
        id++;
    }

}
