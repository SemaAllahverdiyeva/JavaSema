package lesson37;

public class ShoppingCart {
    public static void sum(Product p1, Product p2, Product p3) {
        double a = 0;

        a = p1.getPrice() + p2.getPrice() + p3.getPrice();

        System.out.println("Umumi qiymet: " + a);
}
}