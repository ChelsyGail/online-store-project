package members;

import products.Book;
import products.Print;
import products.Template;


public class SystemManager {
    // create storage for products
    public static Book[] myBooks = new Book[20];
    public static Print[] myPrints = new Print[20];
    public static Template[] myTemplates = new Template[20];

    static int bookCount = 0;
    int printCount = 0;
    int templateCount = 0;

    // adding new products
    public static void addBook(double price, String title, String genre, String artist, String seller, int numberOfPages) {
        myBooks[bookCount] = new Book(price, title, genre, artist, seller, numberOfPages);
        bookCount++;
    }
}
