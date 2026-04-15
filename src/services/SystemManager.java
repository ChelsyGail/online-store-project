package services;

import models.Product;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.UUID;


public class SystemManager {
    // create storage for products
    private static Dictionary<UUID, Product> products = new Hashtable<>();

    /**
     *
     * @param product that the seller wants to add
     * @param username of the seller
     * @param password of the buyer
     * Verifies if this user has authority to sell a product before listing the product
     */
    public static void addProduct(Product product, String username, String password) {
        if (UserManager.verify(username, password)) {
            products.put(product.id, product);
        }
    }

    /**
     *
     * @param id id of the produce
     * @param username of buyer
     * @param password of buyer
     * @return true if order is placed, false otherwise
     */
    public static boolean placeOrder(UUID id, String username, String password) {
        if (UserManager.verify(username, password)) {
            products.remove(id);
            return true;
        } else {
            return false;
        }
    }

    // filtering

}
