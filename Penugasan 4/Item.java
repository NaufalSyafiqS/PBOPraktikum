public class Item {
    private String name;
    private Item() {
        name = "Ipin";
    }
    public Item(String name) {
        this(); // Memanggil konstruktor tanpa parameter untuk mengatur name ke "Ipin"
        //* this.name = name.toLowerCase(); // Mengubah name ke huruf kecil *//
        System.out.println(this.name);
    }
}
