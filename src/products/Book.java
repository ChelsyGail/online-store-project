package products;

public class Book extends Product {
    int numberOfPages;

    // constructors
    public Book(double price, String title, String genre, String artist, String seller, int numberOfPages) {
        super(price, title, genre, artist, seller);
        this.numberOfPages = numberOfPages;
    }

    // setters and getters
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public static void main(String[] args) {
        Book book1 = new Book(21,"yes", "romance", "df", "n/a", 230);
       // System.out.println(book1.getPrice());
    }
}
