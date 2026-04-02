package members;

import products.Product;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.UUID;


public class SystemManager {
    // create storage for products
    private static Dictionary<UUID, Product> products = new Hashtable<>();

    // adding new products. The username and password is to verify they are a user and are authorized to do such actions
    /**
     *
     * @param product the product to add (ex. book, print, etc.)
     */
    public static void addProduct(Product product, String username, String password) {
        if (UserManager.verify(username, password)) {
            products.put(product.id, product);
        }
    }

    // place orders
    public static boolean placeOrder(UUID id, String username, String password) {
        if (UserManager.verify(username, password)) {
            products.remove(id);
            return true; // order placed
        } else {
            return false;
        }
    }

}
