package services;
import models.Product;
import models.UserType;

import java.util.*;


public class SystemManager {
    // create storage for products
    private static final Map<UUID, Product> products = new HashMap<>();

    // returns true if user type is admin
    private static boolean isAdmin() {
        return Session.isLoggedIn() && Session.getCurrentUser().getUserType() == UserType.ADMIN;
    }
    /**
     *
     * @param product that the seller wants to add
     * Verifies if this user has authority to sell a product before listing the product
     * @ return False if user is not admin, true if user is admin and product is added
     */
    public static boolean addProduct(Product product) {
        if (!isAdmin()) return false;
        products.put(product.id, product);
        return true;
    }

    /**
     *
     * @param id of the product that the seller wants to remove
     * @return false if product cannot be removed due to user rights, and true is user has rights and product has been removed
     */
    public static boolean removeProduct(UUID id) {
        if (!isAdmin()) return false;
        products.remove(id);
        return true;
    }

    /**
     *
     * @param id id of the product the customer wants to buy
     * @return true if order is placed, false otherwise
     */
    public static boolean placeOrder(UUID id) {
        // user must be logged in to place an order
        if (!Session.isLoggedIn()) return false;

        // product gets removed from the list once ordered
        products.remove(id);
        return true;
    }

    // this will return all listed products
    public static List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    /**
     *
     * @param query the string that the user searches for
     * @return the list of all products related to the query
     */
    public static List<Product> searchProducts(String query) {
        List<Product> results = new ArrayList<>();
        String lower = query.toLowerCase();

        // gets all products that is related to the query
        for (Product product : products.values()) {
            if (product.getTitle().toLowerCase().contains(lower)) {
                results.add(product);
            }
        }
        return results;
    }



}
