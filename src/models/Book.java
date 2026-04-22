package models;

import interfaces.Discountable;

public class Book extends Product implements Discountable {
    private int numberOfPages;

    /** The discount percentage (0–100). Zero means no discount. */
    private double discountPercent = 0;

    /** constructs a new book
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

    @Override
    public void applyDiscount(double percent) {
        this.discountPercent = percent;
    }

    @Override
    public double getDiscountedPrice() {
        return price - (price * discountPercent / 100);
    }


}
