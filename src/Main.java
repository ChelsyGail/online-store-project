import services.SystemManager;
import services.UserManager;
import models.Book;
import models.Print;
import models.Template;

public void main(String[] args) {
    UserManager.addUser("admin", "");

    Template template = new Template(12.99, "Test", "Test", "Test", "Test", "Powerpoint");

    SystemManager.addProduct(new Book(12.99, "Test", "Test", "Test", "Test", 123), "admin", "");
    SystemManager.addProduct(template, "admin", "");
    SystemManager.addProduct(new Print(12.90, "Test", "Test", "Test", "Test", 12, 4), "admin", "");


//
//    if (product1 instanceof Template template) {
//        System.out.println(template.getMedium());
//    }
}
