package members;

import products.Product;


public class SystemManager {
    // create storage for products
    public static Product[] products = new Product[50];
    static int productCount = 0;


    // adding new products
    /**
     *
     * @param product the product to add (ex. book, print, etc.)
     */
    public static void addProduct(Product product) {
        products[productCount] = product;
        productCount++;
    }



}
