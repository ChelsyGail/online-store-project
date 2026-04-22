import models.*;
import services.Session;
import services.SystemManager;
import services.UserManager;
import services.Session;
import static services.SystemManager.getAllProducts;

public void main(String[] args) {
    UserManager.addUser("admin", "admin123", UserType.ADMIN);

    // enter username and password

    Session.login(UserManager.login("admin", "admin123"));
    System.out.print(Session.isLoggedIn());

    // make inventory
    Map<UUID, Product> products = new HashMap<>();

    // user enters book name

    Book book1 = new Book(12.99, "Java Principles", "Educational", "David R.", "EducCo", 50);

    // add a product
    SystemManager.addProduct(book1);
    // access inventory
    System.out.println(getAllProducts());

    Session.logout();

    UserManager.addUser("Chelsy Gail", "chelsy12", UserType.CUSTOMER);
    Session.login(UserManager.login("Chelsy Gail", "chelsy12"));

    UUID book1ID = book1.id;
    SystemManager.placeOrder(book1ID);
    System.out.println(Session.getCurrentUser().getUsername());
    System.out.println(getAllProducts() + "none");
}
