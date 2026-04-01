import members.SystemManager;
import products.Book;
import products.Print;
import products.Template;

import static members.SystemManager.products;

public static void main(String[] args) {
    // all just tests for each product
    SystemManager.addProduct(new Book(12.3, "Some", "Fiction", "David F.", "unknown", 231));
    SystemManager.addProduct(new Print(5.99, "Floral", "Romantic", "Dark.", "unknown", 2.4, 3.4));
    SystemManager.addProduct(new Template(3.99, "Minimal Brown", "Simple", "unknown.", "unknown", "Powerpoint"));


}
