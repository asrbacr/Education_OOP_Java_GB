import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lase", "Чипсы", 59);
        item1.setPrice(98);
        // System.out.println(item1.toString());

        Product item2 = new Bottle(2, "Colla", "Water", 70, 500);
        
        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Масло", "Масло", 599));
        iMachine.addProduct(new Bottle(4, "Вода", "Whater", 599, 50));

        Product item3 = new HotDrink(5, "Espresso", "Кофе", 25, 100, 50);
        iMachine.addProduct(item3);
        iMachine.addProduct(new HotDrink(6, "Latte", "Кофе", 90, 300, 38));

        for (Product prod : iMachine.getProducts()) {
            System.out.println(prod.toString());
        }

    }
}
