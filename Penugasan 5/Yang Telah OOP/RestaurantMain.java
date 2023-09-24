public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan ("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Mendoan", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Gehu", 1_000, 15);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Onde", 1000, 30);
        menu.tampilMenuMakanan ();

        menu.placeOrder(1,15);
        menu.displayOrders();

        menu.placeOrder(1,5);
        menu.displayOrders();
    }
}