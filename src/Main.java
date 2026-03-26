import members.SystemManager;
import static members.SystemManager.myBooks;

public static void main(String[] args) {

    SystemManager.addBook(12.0, "Hello", "Fiction.", "David", "Company", 231);
    System.out.println(myBooks[0].getPrice());

}
