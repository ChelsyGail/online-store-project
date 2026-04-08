package models;
public class Book extends Product {
    private int numberOfPages;

    /**
     *
     * @param price  the price of the book
     * @param title  the title of the book
     * @param genre  the genre of the book
     * @param artist the author of the book
     * @param seller the seller of the book
     * @param numberOfPages  the number of pages of the book
     */
    public Book(double price, String title, String genre, String artist, String seller, int numberOfPages) {
        super(price, title, genre, artist, seller);
        this.numberOfPages = numberOfPages;
    }

    /**
     * returns the number of pages in a book
     * @return the number of pages in the book
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * set the number of pages of a book
     * @param numberOfPages the new number of pages
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

}
