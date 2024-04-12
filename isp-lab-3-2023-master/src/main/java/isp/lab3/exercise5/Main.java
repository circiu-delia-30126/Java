package isp.lab3.exercise5;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(12, "Cola", 3, 5);
        Product p2 = new Product(8, "Inghetata", 12, 7);
        Product p3 = new Product(5, "Ciocolata", 6, 3);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(13);
        vendingMachine.addProduct(p1);
        vendingMachine.addProduct(p2);
        vendingMachine.addProduct(p3);

        vendingMachine.displayCredit();
        System.out.println("\n");
        vendingMachine.displayProducts();
        System.out.println("\n");
        System.out.println(vendingMachine.selectProduct(12));
        System.out.println("\n");
        vendingMachine.userMenu();

    }
}
